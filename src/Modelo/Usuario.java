/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Intel
 */
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private Date fechaNacimientoUsuario;
    private String username;

    public ConexionBD objCon = new ConexionBD();
    public ResultSet objDatosConsulta;
    public CallableStatement objInstruccionSQL;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Date fechaNacimientoUsuario, String username) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.username = username;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean registrar() {
        System.out.println("1");
        try {
            System.out.println("2");
            if (objCon.abrirConexion()) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String fechaNacimiento = dateFormat.format(this.fechaNacimientoUsuario);
                System.out.println("3");
                objInstruccionSQL = objCon.getObjCon().prepareCall("call dynamotion2.sp_insertarUsuario(?,?,?,?,?,?);");
                System.out.println("4");
                objInstruccionSQL.setString(1, this.nombre);
                System.out.println("5");
                objInstruccionSQL.setString(2, this.apellidoPaterno);
                System.out.println("6");
                objInstruccionSQL.setString(3, this.apellidoMaterno);
                System.out.println("7");
                objInstruccionSQL.setString(4, this.telefono);
                System.out.println("8");
                objInstruccionSQL.setString(5, fechaNacimiento);
                objInstruccionSQL.setString(6, username);
                System.out.println("11");
                System.out.println(objInstruccionSQL.toString()); // imprime la sentencia SQL completa
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

    public void consultarUsuario() {

    }

    public void modificarUsuario() {

    }

    public void eliminarUsuario() {

    }

}
