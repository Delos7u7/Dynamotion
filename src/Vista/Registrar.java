/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CtrlLogin;
import Controlador.CtrlUsuario;
import Modelo.Usuario;
import Modelo.login;
import Modelo.rolusuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.swing.JPasswordField;

/**
 *
 * @author Intel
 */
public class Registrar extends javax.swing.JFrame {

    /**
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
        Registrar.this.setLocationRelativeTo(null);
    }
    
    public void registrarr(){
        Usuario mod = new Usuario();
        login log = new login();
        CtrlUsuario ctrl = new CtrlUsuario(mod, log , this);
        CtrlLogin ctrlLog = new CtrlLogin(2);
        ctrlLog.menuOpciones();
        ctrl.iniciar();
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        lblRegistrar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnYaTienesCuenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApPaternoUsuario = new javax.swing.JTextField();
        txtApMaternoUsuario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnRegi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre de Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Apellido Paterno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Apellido Materno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Télefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 255));
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 126, 350, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mi proyecto2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(153, 153, 255));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        lblRegistrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("REGISTRARSE");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 110, 50));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 500));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Ingresa tus datos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel13)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 730, 60));

        btnYaTienesCuenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnYaTienesCuenta.setForeground(new java.awt.Color(51, 51, 51));
        btnYaTienesCuenta.setText("¿Ya tienes una cuenta?");
        jPanel1.add(btnYaTienesCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 350, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 142, 350, -1));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 203, 350, 10));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 253, 350, -1));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 313, 350, -1));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 363, 350, -1));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 413, 350, -1));

        txtNombreUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtNombreUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreUsuario.setBorder(null);
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 75, 350, -1));

        txtApPaternoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtApPaternoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtApPaternoUsuario.setBorder(null);
        txtApPaternoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPaternoUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtApPaternoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 188, 350, -1));

        txtApMaternoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtApMaternoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtApMaternoUsuario.setBorder(null);
        txtApMaternoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMaternoUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtApMaternoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 238, 350, -1));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 255));
        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 298, 350, -1));

        txtFechaNacimiento.setBackground(new java.awt.Color(204, 204, 255));
        txtFechaNacimiento.setForeground(new java.awt.Color(51, 51, 51));
        txtFechaNacimiento.setBorder(null);
        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 348, 350, -1));

        txtContraseña.setBackground(new java.awt.Color(204, 204, 255));
        txtContraseña.setBorder(null);
        txtContraseña.setEchoChar('*');
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseReleased(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 395, 350, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo2.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 60, 40));

        btnRegi.setText("Registrarse");
        btnRegi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegiMouseEntered(evt);
            }
        });
        btnRegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegiActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        txtContraseña.setEchoChar((char) 0);
    }//GEN-LAST:event_jLabel14MousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed

    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

    }//GEN-LAST:event_jPanel5MouseClicked

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped

    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' '))
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApPaternoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPaternoUsuarioKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' '))
            evt.consume();
    }//GEN-LAST:event_txtApPaternoUsuarioKeyTyped

    private void txtApMaternoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMaternoUsuarioKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' '))
            evt.consume();
    }//GEN-LAST:event_txtApMaternoUsuarioKeyTyped

    private void txtContraseñaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseReleased

    }//GEN-LAST:event_txtContraseñaMouseReleased

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased
        txtContraseña.setEchoChar('*');
    }//GEN-LAST:event_jPanel5MouseReleased

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        txtContraseña.setEchoChar('*');
    }//GEN-LAST:event_jPanel5MouseExited

    private void btnRegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegiActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked

    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnRegiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegiMouseClicked
        AdminoInvJframe AdJF = new AdminoInvJframe();
        AdminoInvi ad = new AdminoInvi();
        ad.setSize(470,300);
        ad.setLocation(0, 0);
        AdJF.jPanel111.removeAll();
        AdJF.jPanel111.add(ad, BorderLayout.CENTER);
        AdJF.jPanel111.revalidate();
        AdJF.jPanel111.repaint();    
        AdJF.setLocationRelativeTo(null);
        AdJF.setVisible(true);
        if (ad.getX()==1) {
            
        
        Usuario mod = new Usuario();
        login log = new login();
        CtrlUsuario ctrl = new CtrlUsuario(mod, log , this);
        CtrlLogin ctrlLog = new CtrlLogin(2);
        ctrlLog.menuOpciones();
        ctrl.iniciar();
        this.dispose();
        }
        
    }//GEN-LAST:event_btnRegiMouseClicked

    private void btnRegiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegiMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegi;
    public javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel btnYaTienesCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JLabel lblRegistrar;
    public javax.swing.JTextField txtApMaternoUsuario;
    public javax.swing.JTextField txtApPaternoUsuario;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtFechaNacimiento;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombreUsuario;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
