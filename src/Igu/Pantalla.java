/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Igu;

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

        barramenu = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        itemIniciarSesionUsuario = new javax.swing.JMenuItem();
        itemAgregarUsuario = new javax.swing.JMenuItem();
        itemConsultarUsuario = new javax.swing.JMenuItem();
        itemEditarUsuario = new javax.swing.JMenuItem();
        itemEliminarUsuario = new javax.swing.JMenuItem();
        subMenuReporteUsuario = new javax.swing.JMenu();
        itemBuscarUsuarioXNombre = new javax.swing.JMenuItem();
        itemBuscarUsuarioXCorreo = new javax.swing.JMenuItem();
        itemBuscarUsuarioXTelefono = new javax.swing.JMenuItem();
        MenuServicios = new javax.swing.JMenu();
        itemAgregarServicios = new javax.swing.JMenuItem();
        itemConsultarServicios = new javax.swing.JMenuItem();
        itemEditarServicios = new javax.swing.JMenuItem();
        itemEliminarServicios = new javax.swing.JMenuItem();
        subMenuReporteServicios = new javax.swing.JMenu();
        itemBuscarServicioXNombre = new javax.swing.JMenuItem();
        itemBuscarServicioXValor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuUsuarios.setText("Usuarios");

        itemIniciarSesionUsuario.setText("Inicio de sesión...");
        itemIniciarSesionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSesionUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemIniciarSesionUsuario);

        itemAgregarUsuario.setText("Agregar usuario..");
        itemAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAgregarUsuario);

        itemConsultarUsuario.setText("Consultar datos..");
        itemConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemConsultarUsuario);

        itemEditarUsuario.setText("Editar mis datos...");
        itemEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemEditarUsuario);

        itemEliminarUsuario.setText("Eliminar mis datos..");
        itemEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemEliminarUsuario);

        subMenuReporteUsuario.setText("Reportes");

        itemBuscarUsuarioXNombre.setText("Nombre...");
        subMenuReporteUsuario.add(itemBuscarUsuarioXNombre);

        itemBuscarUsuarioXCorreo.setText("Correo...");
        subMenuReporteUsuario.add(itemBuscarUsuarioXCorreo);

        itemBuscarUsuarioXTelefono.setText("Telefono...");
        subMenuReporteUsuario.add(itemBuscarUsuarioXTelefono);

        menuUsuarios.add(subMenuReporteUsuario);

        barramenu.add(menuUsuarios);

        MenuServicios.setText("Servicios");

        itemAgregarServicios.setText("Agregar servicios..");
        itemAgregarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarServiciosActionPerformed(evt);
            }
        });
        MenuServicios.add(itemAgregarServicios);

        itemConsultarServicios.setText("Consultar servicios..");
        itemConsultarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarServiciosActionPerformed(evt);
            }
        });
        MenuServicios.add(itemConsultarServicios);

        itemEditarServicios.setText("Editar servicios..");
        itemEditarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarServiciosActionPerformed(evt);
            }
        });
        MenuServicios.add(itemEditarServicios);

        itemEliminarServicios.setText("Eliminar servicios...");
        itemEliminarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarServiciosActionPerformed(evt);
            }
        });
        MenuServicios.add(itemEliminarServicios);

        subMenuReporteServicios.setText("Reportes");

        itemBuscarServicioXNombre.setText("Nombre...");
        subMenuReporteServicios.add(itemBuscarServicioXNombre);

        itemBuscarServicioXValor.setText("Valor...");
        subMenuReporteServicios.add(itemBuscarServicioXValor);

        MenuServicios.add(subMenuReporteServicios);

        barramenu.add(MenuServicios);

        jMenu3.setText("Ayuda");

        jMenuItem16.setText("Acerca de...");
        jMenu3.add(jMenuItem16);

        barramenu.add(jMenu3);

        setJMenuBar(barramenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemIniciarSesionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemIniciarSesionUsuarioActionPerformed

    private void itemAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarUsuarioActionPerformed

    private void itemConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarUsuarioActionPerformed

    private void itemEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarUsuarioActionPerformed

    private void itemEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEliminarUsuarioActionPerformed

    private void itemAgregarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarServiciosActionPerformed

    private void itemConsultarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarServiciosActionPerformed

    private void itemEditarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarServiciosActionPerformed

    private void itemEliminarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEliminarServiciosActionPerformed

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
    private javax.swing.JMenu MenuServicios;
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JMenuItem itemAgregarServicios;
    private javax.swing.JMenuItem itemAgregarUsuario;
    private javax.swing.JMenuItem itemBuscarServicioXNombre;
    private javax.swing.JMenuItem itemBuscarServicioXValor;
    private javax.swing.JMenuItem itemBuscarUsuarioXCorreo;
    private javax.swing.JMenuItem itemBuscarUsuarioXNombre;
    private javax.swing.JMenuItem itemBuscarUsuarioXTelefono;
    private javax.swing.JMenuItem itemConsultarServicios;
    private javax.swing.JMenuItem itemConsultarUsuario;
    private javax.swing.JMenuItem itemEditarServicios;
    private javax.swing.JMenuItem itemEditarUsuario;
    private javax.swing.JMenuItem itemEliminarServicios;
    private javax.swing.JMenuItem itemEliminarUsuario;
    private javax.swing.JMenuItem itemIniciarSesionUsuario;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu subMenuReporteServicios;
    private javax.swing.JMenu subMenuReporteUsuario;
    // End of variables declaration//GEN-END:variables
}
