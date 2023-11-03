/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Igu;

import javax.swing.JOptionPane;
import proyecto.aula.Usuario;

/**
 *
 * @author Usuario
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        barramenu = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        itemAgregarUsuario = new javax.swing.JMenuItem();
        itemConsultarUsuario = new javax.swing.JMenuItem();
        itemEditarUsuario = new javax.swing.JMenuItem();
        subMenuReporteUsuarios = new javax.swing.JMenu();
        itemTodosLosUsuarios1 = new javax.swing.JMenuItem();
        itemBuscarUsuarioXTelefono = new javax.swing.JMenuItem();
        itemBuscarServicioXValor1 = new javax.swing.JMenuItem();
        itemBuscarServicioXEmail = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("..:GESTION DE SERVICIOS:..");
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/FONDITO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
        );

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/usuario24px.png"))); // NOI18N
        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        itemAgregarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/add24px.png"))); // NOI18N
        itemAgregarUsuario.setText("Agregar usuario..");
        itemAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAgregarUsuario);

        itemConsultarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemConsultarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/buscar24px.png"))); // NOI18N
        itemConsultarUsuario.setText("Consultar datos..");
        itemConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemConsultarUsuario);

        itemEditarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/edit24px.png"))); // NOI18N
        itemEditarUsuario.setText("Editar mis datos...");
        itemEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemEditarUsuario);

        subMenuReporteUsuarios.setText("Reportes");
        subMenuReporteUsuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemTodosLosUsuarios1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemTodosLosUsuarios1.setText("Todos...");
        itemTodosLosUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTodosLosUsuarios1ActionPerformed(evt);
            }
        });
        subMenuReporteUsuarios.add(itemTodosLosUsuarios1);

        itemBuscarUsuarioXTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemBuscarUsuarioXTelefono.setText("Por nombre...");
        subMenuReporteUsuarios.add(itemBuscarUsuarioXTelefono);

        itemBuscarServicioXValor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemBuscarServicioXValor1.setText("Por telefono...");
        itemBuscarServicioXValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarServicioXValor1ActionPerformed(evt);
            }
        });
        subMenuReporteUsuarios.add(itemBuscarServicioXValor1);

        itemBuscarServicioXEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemBuscarServicioXEmail.setText("Por email...");
        itemBuscarServicioXEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarServicioXEmailActionPerformed(evt);
            }
        });
        subMenuReporteUsuarios.add(itemBuscarServicioXEmail);

        menuUsuarios.add(subMenuReporteUsuarios);

        barramenu.add(menuUsuarios);

        setJMenuBar(barramenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarUsuarioActionPerformed
    PantallaUsuarios dialog = new PantallaUsuarios(this, true); 

   dialog.setVisible(true);
    }//GEN-LAST:event_itemAgregarUsuarioActionPerformed

    private void itemConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarUsuarioActionPerformed

      
          
    }//GEN-LAST:event_itemConsultarUsuarioActionPerformed

    private void itemBuscarServicioXValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarServicioXValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarServicioXValor1ActionPerformed

    private void itemBuscarServicioXEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarServicioXEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarServicioXEmailActionPerformed

    private void itemTodosLosUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTodosLosUsuarios1ActionPerformed
     
            if(Usuario.usuarioBD == null || Usuario.usuarioBD.isEmpty()){
            JOptionPane.showMessageDialog(this, "No existen usuarios registrados"
                   );
        return;
            }
        VentanaReporteUsuarios ventana = new VentanaReporteUsuarios (this,true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);

    }//GEN-LAST:event_itemTodosLosUsuarios1ActionPerformed

    private void itemEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JMenuItem itemAgregarUsuario;
    private javax.swing.JMenuItem itemBuscarServicioXEmail;
    private javax.swing.JMenuItem itemBuscarServicioXValor1;
    private javax.swing.JMenuItem itemBuscarUsuarioXTelefono;
    private javax.swing.JMenuItem itemConsultarUsuario;
    private javax.swing.JMenuItem itemEditarUsuario;
    private javax.swing.JMenuItem itemTodosLosUsuarios1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu subMenuReporteUsuarios;
    // End of variables declaration//GEN-END:variables
}
