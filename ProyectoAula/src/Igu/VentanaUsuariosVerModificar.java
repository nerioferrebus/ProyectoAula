/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Igu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author ZONA DIGITAL
 */
public class VentanaUsuariosVerModificar extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla2
     */
    public VentanaUsuariosVerModificar() {
        initComponents();
    }

    VentanaUsuariosVerModificar(VentanaReportes aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        campoCedula = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoFechaE = new javax.swing.JTextField();
        campoHabitacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        respuesta = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        campoPago = new javax.swing.JTextField();
        campoFechaS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoCedula.setBorder(javax.swing.BorderFactory.createTitledBorder("Cedula"));

        campoEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        campoTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        campoNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        campoFechaE.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Entrada"));

        campoHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Habitacion"));

        jLabel1.setText("<html>Introduzca la cedula a modificar");

        txt_cedula.setBorder(javax.swing.BorderFactory.createTitledBorder("CEDULA"));
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDITAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("VOLVER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        campoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago"));

        campoFechaS.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Salida\n"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoFechaS, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFechaE, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addGap(181, 181, 181))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(campoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(campoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txt_cedula.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "   NO HA INTRODUCIDO EL ID\n"
                    + "POR FAVOR INTRODUZCA UN ID", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        
        }

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from usuarios where CEDULA = ?");

            pst.setString(1, txt_cedula.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                campoCedula.setText(rs.getString("CEDULA"));
                campoNombre.setText(rs.getString("NOMBRE"));
                campoEmail.setText(rs.getString("EMAIL"));
                campoTelefono.setText(rs.getString("TELEFONO"));
                campoFechaE.setText(rs.getString("FECHAE"));
                campoFechaS.setText(rs.getString("FECHAS"));
                campoPago.setText(rs.getString("PAGORECIBIDO"));
                campoHabitacion.setText(rs.getString("HABITACION"));

            } else {

                JOptionPane.showConfirmDialog(null, "Cliente no registrado", "ERROR", JOptionPane.WARNING_MESSAGE);

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                if (campoCedula.getText().trim().isEmpty() || 
                    campoNombre.getText().trim().isEmpty() || campoEmail.getText().trim().isEmpty() ||
                    campoTelefono.getText().trim().isEmpty() || campoFechaE.getText().trim().isEmpty() ||
                    campoHabitacion.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO NINGUN ITEM PARA MODIFICAR\n"
                    + "      POR FAVOR SELECCIONE EL ITEM A MODIFICAR", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        
        }

        int resp = JOptionPane.showConfirmDialog(null, "¿Desea modificar el contenido?", "Confirmar modificacion", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                   
            try {

                String cedula = txt_cedula.getText().trim();

                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
                PreparedStatement pst = cn.prepareStatement("update usuarios set NOMBRE = ?, EMAIL = ?, TELEFONO = ?, FECHAE = ?, FECHAS = ?, PAGORECIBIDO = ?, PAGORECIBIDO = ? where CEDULA = " + cedula);

                pst.setString(1, campoNombre.getText().trim());
                pst.setString(2, campoEmail.getText().trim());
                pst.setString(3, campoTelefono.getText().trim());
                pst.setString(4, campoFechaE.getText().trim());
                pst.setString(5, campoFechaS.getText().trim());
                pst.setString(6, campoPago.getText().trim());
                pst.setString(7, campoHabitacion.getText().trim());
                pst.executeUpdate();

                respuesta.setText("MODIFICACION EXITOSA");

                Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        respuesta.setText("");
                    }
                });
                timer.setRepeats(false);
                timer.start();
                                
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaUsuariosVerModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuariosVerModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuariosVerModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuariosVerModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuariosVerModificar().setVisible(true);
            }
        });
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFechaE;
    private javax.swing.JTextField campoFechaS;
    private javax.swing.JTextField campoHabitacion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPago;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel respuesta;
    private javax.swing.JTextField txt_cedula;
    // End of variables declaration//GEN-END:variables
    public class imagenes extends JPanel{
    
    
     @Override
        public void paint(Graphics g){
        super.paint(g);
        
            ImageIcon imagen= new ImageIcon(getClass().getResource("/Icono/usuario128px.png"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
        
        }
        
    } 
    
}

