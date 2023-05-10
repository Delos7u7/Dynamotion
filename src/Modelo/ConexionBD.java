/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Intel
 */
public class ConexionBD {
    private String url;
    private String user;
    private String password;
    private String driverJDBC;
    private Connection objCon;
    public String mensajes="";

    public ConexionBD() {
       this.driverJDBC="com.mysql.cj.jdbc.Driver";
       this.url="jdbc:mysql://localhost:3306/dynamotion2";
       this.user="root";
       this.password="12345678";
       
    }

    public ConexionBD(String url, String user, String password, String driverJDBC) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.driverJDBC = driverJDBC;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverJDBC() {
        return driverJDBC;
    }

    public void setDriverJDBC(String driverJDBC) {
        this.driverJDBC = driverJDBC;
    }

    public Connection getObjCon() {
        return objCon;
    }

    public void setObjCon(Connection objCon) {
        this.objCon = objCon;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }
    
    public boolean abrirConexion()
    {
        try {
            Class.forName(this.driverJDBC);
            objCon=DriverManager.getConnection(this.url, this.user, this.password);
            if(objCon!=null)
            {
                this.mensajes="Se estableció correctamente la Conexion";
                return true;
            }
        } catch (SQLException ex) {
            this.mensajes="Error de conexionn" + ex.getMessage();
        } catch (ClassNotFoundException ex)
        {
            this.mensajes="Error de conexionxd" + ex.getMessage();
        }
        
        
        return false;
    }
    
    public void cerrarConexion()
    {
        try {
            objCon.close();
        } catch (SQLException ex) {
            this.mensajes="Error de conexcionnnn" + ex.getMessage();
        }
    }
        
}