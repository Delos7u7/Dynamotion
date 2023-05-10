/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.login;
import Vista.Home;
import Vista.Login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class CtrlLogin {
    private int op;
    private login objLog;
    public Login vistaLogin;
    private String prueba ="Esto es una prueba";
     public CtrlLogin() {
    }

    public CtrlLogin(int op, String nombreUsuario, String claveLogin, Login vistaLogin) {
        this.op = op;
        this.objLog = new login(nombreUsuario, claveLogin);
        this.vistaLogin=vistaLogin;
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
    
    //Metodo para el menu de opcion
    
    public void menuOpciones(){
        
        switch (this.op) {
            case 1: //Validar Login
                
                if (objLog.validarLogin()) {
                    JOptionPane.showMessageDialog(null, "Usuario Válido");
                    Home p1 = new Home();
                    p1.setVisible(true);
                    this.vistaLogin.setVisible(false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no válido");
                }
                
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    
    
}