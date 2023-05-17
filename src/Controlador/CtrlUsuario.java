/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Modelo.login;
import Vista.Login;
import Vista.Registrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public CtrlUsuario() {
    }

    public CtrlUsuario(Usuario mod, Registrar frm, login log) {
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