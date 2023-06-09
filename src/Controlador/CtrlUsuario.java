/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Modelo.login;
import Vista.Home;
import Vista.Login;
import Vista.PanelPerfil;
import Vista.Registrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Intel
 */
public class CtrlUsuario implements ActionListener {
    private Usuario mod;
    private login log;
    private Registrar frm;
    private login modC;
    private int op;
    private PanelPerfil datos;
    private JLabel j;

    public CtrlUsuario() {
    }
    public CtrlUsuario(Usuario u,int op){
        this.mod=u;
        this.op=op;
    }

    public CtrlUsuario(Usuario mod, Registrar frm, login log, int op) {
        this.op=op;
        this.mod = mod;
        this.frm = frm;
        this.log = log;
        this.frm.txtNombreUsuario.addActionListener(this);
        this.frm.txtNombre.addActionListener(this);
        this.frm.txtApPaternoUsuario.addActionListener(this);
        this.frm.txtApMaternoUsuario.addActionListener(this);
        this.frm.txtTelefono.addActionListener(this);
        this.frm.txtFechaNacimiento.addActionListener(this);
        this.frm.txtContraseña.addActionListener(this);
        this.frm.btnRegi.addActionListener(this);
        
    }

    public void iniciar() {
        //frm.setLocation(null);
    }
    public void menuOpciones() {
System.out.println("XDPanel2");
        switch (this.op) {
            case 1: //Validar Login

             //String encabezado[]={"idUsuario", "Nombre del Usuario", "Apellido Paterno", "Apellido Materno", "Email",
              //  "Status Usuario", "Telefono Usuario"};
              //  this.datos.setColumnIdentifiers(encabezado);
                PanelPerfil panelPerfil = new PanelPerfil();
                Object[] datosU=new Object[7];
                System.out.println("XDPanel");
                for (Usuario usuario : this.mod.consultarUsuario()) {
                    
                    datosU[0]=usuario.getIdUsuario();
                    datosU[1]=usuario.getNombre();
                    datosU[2]=usuario.getApellidoPaterno();
                    datosU[3]=usuario.getApellidoMaterno();
                    datosU[4]=usuario.getFechaNacimientoUsuario();
                    datosU[5]=usuario.getTelefono();
                    datosU[6]=usuario.getTelefono();
                    System.out.println(""+panelPerfil.getLblNombre());
                    panelPerfil.getLblNombre().setText(datosU[1].toString());
                    panelPerfil.getLblApellidoPaterno().setText(datosU[2].toString());
                    panelPerfil.getLblApellidoMaterno().setText(datosU[3].toString());
                    panelPerfil.getLblFechaNacimiento().setText(datosU[4].toString());
                    panelPerfil.getLblTelefono().setText(datosU[5].toString());
                    panelPerfil.getLblNombreUsuario().setText(datosU[6].toString());
                    
                }
                
                
                break;

            case 2://Lllenar el login
                System.out.println("Hasta aki todo bn");
                if (log.registrarLoginInv()) {
                    JOptionPane.showMessageDialog(null, "Login Registrado con éxito");
                    System.out.println("Hasta aki todo bn 2");

                } else {
                    JOptionPane.showMessageDialog(null, "Login no registrado");
                }
            default:
                throw new AssertionError();
        }

    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnRegi) {
            System.out.println("XDD");
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            mod.setNombre(frm.txtNombre.getText());
            mod.setApellidoPaterno(frm.txtApPaternoUsuario.getText());
            mod.setApellidoMaterno(frm.txtApMaternoUsuario.getText());
            mod.setTelefono(frm.txtTelefono.getText());
            try {
                mod.setFechaNacimientoUsuario(dateFormat.parse(frm.txtFechaNacimiento.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(CtrlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            modC.setContraseña(frm.txtContraseña.getText());
            mod.setUsername(frm.txtNombreUsuario.getText());

            if (mod.registrar()) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
        
       
        
/*
        if (e.getSource() == frm.btnModificar) {
            mod.setIdusuario(Integer.parseInt(frm.txtBuscar.getText()));
            mod.setNombreUsuario(frm.txtNombre.getText());
            mod.setApPaternoUsuario(frm.txtApPaterno.getText());
            mod.setApMaternoUsuario(frm.txtapMaterno.getText());
            mod.setEmailUsuario(frm.txtEmail.getText());
            mod.setStatusUsuario(Boolean.valueOf(frm.txtStatus.getText()));
            mod.setTelefonoUsuario(frm.txtTelefono.getText());
            if (modC.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        }

        if (e.getSource() == frm.btnEliminar) {
            mod.setIdusuario(Integer.parseInt(frm.txtBuscar.getText()));

            if (modC.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        }

        if (e.getSource() == frm.btnBuscar) {
            System.out.println("Entró");
            mod.setNombreUsuario(frm.txtNombre.getText());
            System.out.println("2");
            if (modC.buscar(mod)) {
                frm.txtBuscar.setText(String.valueOf(mod.getIdusuario()));
                frm.txtNombre.setText(mod.getNombreUsuario());
                frm.txtApPaterno.setText(mod.getApPaternoUsuario());
                frm.txtapMaterno.setText(mod.getApMaternoUsuario());
                frm.txtEmail.setText(mod.getEmailUsuario());
                frm.txtStatus.setText(Boolean.toString(mod.isStatusUsuario()));
                frm.txtTelefono.setText(mod.getTelefonoUsuario());

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró registro");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnLimpiar) {
            limpiar();
        }
*/
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