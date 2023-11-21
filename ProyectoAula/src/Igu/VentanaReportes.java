/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Igu;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hp
 */
public class VentanaReportes extends javax.swing.JFrame {

    public VentanaReportes() {
        initComponents();
    
        DefaultTableModel model = (DefaultTableModel) tablaUsuario.getModel();
        model.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuarios");

            while (rs.next()) {

                String id = rs.getString("id");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String tel = rs.getString("telefono");
                String fechaE = rs.getString("fechae");
                String fechaS = rs.getString("fechas");
                String pagoR = rs.getString("pagorecibido");
                String habitacion = rs.getString("habitacion");

                model.addRow(new Object[]{id, cedula, nombre, email, tel, fechaE, fechaS, pagoR, habitacion});
            }

            rs.close();
            stmt.close();
            conn.close();
         

        } catch (SQLException e) {

        }
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REPORTES");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "EMAIL", "TELEFONO", "FECHAE", "FECHAS", "PAGORECIBIDO", "HABITACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaUsuariosVerModificar modificar = new VentanaUsuariosVerModificar();
        modificar.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
    try {
        String cedulaAEliminar = JOptionPane.showInputDialog(null, "Ingrese la cédula del cliente a eliminar:");

        if (cedulaAEliminar != null && !cedulaAEliminar.isEmpty()) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar el cliente con cédula " + cedulaAEliminar + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
                PreparedStatement pst = cn.prepareStatement("delete from usuarios where cedula = ?");
                pst.setString(1, cedulaAEliminar);

                int filasAfectadas = pst.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente con cédula " + cedulaAEliminar + " eliminado correctamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con la cédula proporcionada.", "Cliente no Encontrado", JOptionPane.WARNING_MESSAGE);
                }

                pst.close();
                cn.close();
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cédula válida.", "Cédula Inválida", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    try {
        
        String cedulaStr = JOptionPane.showInputDialog(null, "Ingrese la cedula a buscar:");


        if (cedulaStr != null && !cedulaStr.isEmpty()) {
            int cedula = Integer.parseInt(cedulaStr);


            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from usuarios where CEDULA = ?");
            pst.setInt(1, cedula);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String mensaje = ""
                        + "Cedula: " + rs.getInt("CEDULA") + "\n"
                        + "Nombre: " + rs.getString("NOMBRE") + "\n"
                        + "Email: " + rs.getString("EMAIL") + "\n"
                        + "Teléfono: " + rs.getString("TELEFONO") + "\n"
                        + "Fecha de entrada: " + rs.getString("FECHAE") + "\n"
                        + "Fecha de salida: " + rs.getString("FECHAS") + "\n"
                        + "Pago: " + rs.getString("PAGORECIBIDO") + "\n"
                        + "Habitación: " + rs.getString("HABITACION");

                JOptionPane.showMessageDialog(null, mensaje, "Cliente Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con la cedula proporcionado.", "Cliente no Encontrado", JOptionPane.WARNING_MESSAGE);
            }

            // Cerrar recursos
            rs.close();
            pst.close();
            cn.close();
        } else {
            // Mostrar un mensaje si no se ingresó un ID válido
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.", "ID Inválido", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        // Capturar excepción si el ID no es numérico
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID numérico válido.", "ID Inválido", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        // Capturar otras excepciones
        JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablaUsuario.getModel();
        model.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuarios");

            while (rs.next()) {

                String id = rs.getString("id");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String tel = rs.getString("telefono");
                String fechaE = rs.getString("fechae");
                String fechaS = rs.getString("fechas");
                String pagoR = rs.getString("pagorecibido");
                String habitacion = rs.getString("habitacion");

                model.addRow(new Object[]{id, cedula, nombre, email, tel, fechaE, fechaS, pagoR, habitacion});
            }

            rs.close();
            stmt.close();
            conn.close();
         

        } catch (SQLException e) {

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuario;
    // End of variables declaration//GEN-END:variables
}
