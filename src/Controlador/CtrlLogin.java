/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Modelo.login;
import Vista.Home;
import Vista.Login;
import Vista.Registrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class CtrlLogin{

    private int op;
    private login objLog;
    public Login vistaLogin;
    private String prueba = "Esto es una prueba";
    private Usuario mod;
    private Registrar frm;

    public CtrlLogin() {
    }

    public CtrlLogin(int op, String nombreUsuario, String claveLogin, Login vistaLogin) {
        this.op = op;
        this.objLog = new login(nombreUsuario, claveLogin);
        System.out.println(nombreUsuario + " " + claveLogin);
        this.vistaLogin = vistaLogin;
    }

    public CtrlLogin(login log, Registrar frm, int op) {
        this.op = op;
        this.mod = new Usuario();  // Crear una nueva instancia de Usuario
        this.frm = frm;
        objLog = new login(mod);

    }

    public CtrlLogin(int op) {
        this.op = op;
        this.objLog = new login();
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public login getObjLog() {
        return objLog;
    }

    public void setObjLog(login objLog) {
        this.objLog = objLog;
    }

    public void Entro(){
            System.out.println("XDD");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            mod.setNombre(frm.txtNombre.getText());
            System.out.println("NombreUsuario En controlador: "+ frm.txtNombre.getText());
            mod.setApellidoPaterno(frm.txtApPaternoUsuario.getText());
            mod.setApellidoMaterno(frm.txtApMaternoUsuario.getText());
            mod.setTelefono(frm.txtTelefono.getText());
            try {
                mod.setFechaNacimientoUsuario(dateFormat.parse(frm.txtFechaNacimiento.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(CtrlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            objLog.setContraseña(frm.txtContraseña.getText());
            mod.setUsername(frm.txtNombreUsuario.getText());

            if (objLog.registrarLoginInv()) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }  
    }

    //Metodo para el menu de opcion
    public void menuOpciones() {

        switch (this.op) {
            case 1: //Validar Login
                System.out.println("Entra al case");
                if (objLog.validarLogin()) {
                    System.out.println("Entra 1");
                    JOptionPane.showMessageDialog(null, "Usuario Válido");
                    Home p1 = new Home();
                    p1.setVisible(true);
                    this.vistaLogin.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no válido");
                }

                break;

            case 2://Lllenar el login
                System.out.println("Hasta aki todo bn");
                if (objLog.registrarLoginInv()) {
                    JOptionPane.showMessageDialog(null, "Login Registrado con éxito");
                    System.out.println("Hasta aki todo bn 2");

                } else {
                    JOptionPane.showMessageDialog(null, "Login no registrado");
                }
            default:
                throw new AssertionError();
        }

    }

    public void limpiar() {
        frm.txtNombre.setText(null);
        frm.txtApPaternoUsuario.setText(null);
        frm.txtApMaternoUsuario.setText(null);
        frm.txtTelefono.setText(null);
        frm.txtFechaNacimiento.setText(null);
        frm.txtContraseña.setText(null);
        frm.txtNombreUsuario.setText(null);
    }

}
