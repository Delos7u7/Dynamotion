/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Intel
 */
public class login {

    private int idlogin;
    private Date fechaCreacionLogin;
    private String contraseña;
    //laves foraneas
    private rolusuario objRolUsuario;
    private Usuario objUsuario;

    public CallableStatement objInstruccionSQL;
    public ResultSet objDatosConsulta;
    public ConexionBD objCon = new ConexionBD();

    public login() {
    }
    
    public login (Usuario us){
        this.objUsuario=us;
    }

    public login(String username, String contraseña) {
        this.objUsuario = new Usuario();

        this.contraseña = contraseña;

        this.objUsuario.setUsername(username);

    }

    public login(int idlogin, Date fechaCreacionLogin, rolusuario objRolUsuario, Usuario objUsuario, CallableStatement objInstruccionSQL, ResultSet objDatosConsulta) {
        this.idlogin = idlogin;
        this.fechaCreacionLogin = fechaCreacionLogin;
        this.objRolUsuario = objRolUsuario;
        this.objUsuario = objUsuario;
        this.objInstruccionSQL = objInstruccionSQL;
        this.objDatosConsulta = objDatosConsulta;
    }

    public login(int idlogin, Date fechaCreacionLogin, String contraseña, rolusuario objRolUsuario, Usuario objUsuario, CallableStatement objInstruccionSQL, ResultSet objDatosConsulta) {
        this.idlogin = idlogin;
        this.fechaCreacionLogin = fechaCreacionLogin;
        this.contraseña = contraseña;
        this.objRolUsuario = objRolUsuario;
        this.objUsuario = objUsuario;
        this.objInstruccionSQL = objInstruccionSQL;
        this.objDatosConsulta = objDatosConsulta;
    }

    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public Date getFechaCreacionLogin() {
        return fechaCreacionLogin;
    }

    public void setFechaCreacionLogin(Date fechaCreacionLogin) {
        this.fechaCreacionLogin = fechaCreacionLogin;
    }

    public rolusuario getObjRolUsuario() {
        return objRolUsuario;
    }

    public void setObjRolUsuario(rolusuario objRolUsuario) {
        this.objRolUsuario = objRolUsuario;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public CallableStatement getObjInstruccionSQL() {
        return objInstruccionSQL;
    }

    public void setObjInstruccionSQL(CallableStatement objInstruccionSQL) {
        this.objInstruccionSQL = objInstruccionSQL;
    }

    public ResultSet getObjDatosConsulta() {
        return objDatosConsulta;
    }

    public void setObjDatosConsulta(ResultSet objDatosConsulta) {
        this.objDatosConsulta = objDatosConsulta;
    }

    public ConexionBD getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionBD objCon) {
        this.objCon = objCon;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean validarLogin() {

        try {

            if (objCon.abrirConexion()) {

                objInstruccionSQL = objCon.getObjCon().prepareCall("call sp_validarInformacion(?,?)");
                objInstruccionSQL.setString(1, this.objUsuario.getUsername());
                objInstruccionSQL.setString(2, contraseña);
                objDatosConsulta = objInstruccionSQL.executeQuery();

                if (objDatosConsulta.next() != false) {
                    return true;
                } else {
                    return false;
                }

            }

        } catch (SQLException ex) {
            objCon.mensajes = "ERROR DE SINTAXIS de SQL " + ex.getMessage();
        }

        return false;
    }

    public ArrayList<Usuario> consultarLogin() {
        ArrayList<Usuario> listaLogin = new ArrayList();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaCreacionLog = dateFormat.format(this.fechaCreacionLogin);
        try {
            if (objCon.abrirConexion()) {
                objInstruccionSQL = objCon.getObjCon().prepareCall("call dynamotion2.sp_ConsultarLogin();");
                objDatosConsulta = objInstruccionSQL.executeQuery();
                while (objDatosConsulta.next()) {
                    Usuario objUsuario = new Usuario();
                    rolusuario rol = new rolusuario();
                    objUsuario.setIdUsuario(this.objDatosConsulta.getInt(1));
                    this.setFechaCreacionLogin(objDatosConsulta.getDate(2));
                    rol.setIdrolusuario(objDatosConsulta.getInt(3));
                    this.setContraseña(objDatosConsulta.getString(4));
                    listaLogin.add(objUsuario);
                }
                objCon.cerrarConexion();
            }

        } catch (SQLException ex) {
            objCon.mensajes = "Error de sintaxis";
        }
        return listaLogin;
    }

    public boolean registrarLoginInv() {
        System.out.println("1");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("3");
        try {
            System.out.println("2");
            if (objCon.abrirConexion()) {
                System.out.println("2.1");
                objInstruccionSQL = objCon.getObjCon().prepareCall("call dynamotion2.sp_insertarLogin(?,?,?,?,?,?,?,?);");
                System.out.println("4");
                objInstruccionSQL.setString(1, objUsuario.getNombre());
                System.out.println("5");
                objInstruccionSQL.setString(2, objUsuario.getApellidoPaterno());
                objInstruccionSQL.setString(3, objUsuario.getApellidoMaterno());
                objInstruccionSQL.setString(4, objUsuario.getTelefono());
                        
                objInstruccionSQL.setDate(5, (java.sql.Date) (objUsuario.getFechaNacimientoUsuario()));
                objInstruccionSQL.setString(6, objUsuario.getUsername());
                objInstruccionSQL.setString(7, this.contraseña);
                objInstruccionSQL.setInt(8, 2);
                int filasAfectadas = objInstruccionSQL.executeUpdate();
                System.out.println("12");
                if (filasAfectadas > 0) {
                    System.out.println("13");
                    return true;
                } else {
                    System.out.println("14");
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("1hhf");
            System.out.println(ex.getMessage()); // imprime el mensaje de error completo
            objCon.mensajes = "ERROR DE SINTAXIS de SQL " + ex.getMessage();
            System.out.println(objCon.mensajes);
        }
        return false;
    }

}
