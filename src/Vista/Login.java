/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CtrlLogin;
import Modelo.ConexionBD;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Delos
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Home h = new Home();
    Registrar r = new Registrar();
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        userPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DY");

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 205, 36));
        jLabel11.setText("NAMOTION");

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("DY");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("\"Enciende tu estado de ánimo con Dynamotion\"");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mi proyecto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addComponent(jLabel9)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel3.setText("Inicia Sesión");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel5.setText("Nombre de usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 0, 20, -1));

        btnEntrar.setBackground(new java.awt.Color(153, 153, 153));
        btnEntrar.setForeground(new java.awt.Color(102, 102, 102));
        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Registrarse");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 205, 36));
        jLabel1.setText("NAMOTION");

        userTxt.setBackground(new java.awt.Color(204, 204, 255));
        userTxt.setForeground(new java.awt.Color(153, 153, 153));
        userTxt.setText("Ingrese su usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 255));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 255));

        userPass.setBackground(new java.awt.Color(204, 204, 255));
        userPass.setForeground(new java.awt.Color(153, 153, 153));
        userPass.setText("*********************");
        userPass.setBorder(null);
        userPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userPassMousePressed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPass, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(140, 140, 140)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(userPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 390, 500));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 205, 36));
        jLabel10.setText("NAMOTION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
  
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        CtrlLogin con = new CtrlLogin(1, userTxt.getText(), userPass.getText(),this);
        con.menuOpciones();
        
        
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        r.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(Color.white);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel6MouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
          if (userTxt.getText().equals("Ingrese su usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }  if (String.valueOf(userPass.getPassword()).isEmpty()) {
            userPass.setText("*********************");
            userPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void userPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPassMousePressed
        if (String.valueOf(userPass.getPassword()).equals("*********************")) {
            userPass.setText("");
            userPass.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su usuario");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userPassMousePressed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
               ConexionBD con = new ConexionBD();
        con.abrirConexion();
        JOptionPane.showMessageDialog(null, con.mensajes);
        con.cerrarConexion();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField userPass;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
