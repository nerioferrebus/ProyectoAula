/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Igu;
import java.util.*;
import javax.swing.JOptionPane;
import proyecto.aula.Usuario;

/**
 *
 * @author Usuario
 */
public class PantallaUsuarios extends javax.swing.JDialog {
        Usuario user;
    /**
     * Creates new form PantallaUsuarios
     */
    public PantallaUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    PantallaUsuarios() {
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

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        campoClave = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jTextField3.setText("jTextField1");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("..: NUEVOS USUARIOS:..");
        setForeground(new java.awt.Color(102, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario para nuevos usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 394, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Datos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CEDULA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 45, 85, 24));

        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 45, 322, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 95, 85, 24));
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 137, 322, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOMBRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 137, 85, 24));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("EMAIL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 179, 85, 24));

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 179, 322, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TELEFONO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 221, 85, 24));

        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 221, 322, -1));
        jPanel1.add(campoClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 96, 322, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 470, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/usuario252px.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 195, 279));

        botonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/cancelar48px.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 57, -1));

        botonGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/guardar48px.png.png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 55, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Guardar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Salir");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 50, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/Iconos/Fondo-Usuario.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       //recuperar los datos ingresados en los campos de el formulario
      
      String cedula = campoCedula.getText();
      char[] clave = campoClave.getPassword();
      String nombre = campoNombre.getText();
      String email = campoEmail.getText();
      String telefono = campoTelefono.getText();
        //creamos un objeto variable de tipo usuario
        
        Usuario user = new Usuario();
        user.cedula = cedula;
        String clave2 = String.valueOf(clave);
        user.cedula = clave2;
        user.nombre = nombre;
        user.email = email;
        user.telefono = telefono;
        
        //validar si ya MAP existe
        
        if(Usuario.usuarioBD == null){
            Usuario.usuarioBD = new HashMap<String, Usuario>();
      
        }
        //validar si MAP ya tiene el usuario guardado
        
        if(Usuario.usuarioBD.containsKey(cedula)){
            String msj = "Ya existe un usuario con este documento\n" + cedula;
            JOptionPane.showMessageDialog(this, msj);
       
       }
        else{
            //obtenemos el numero de usuarios en MAP en caso de que ya existan
          Usuario.usuarioBD.put(cedula, user);
        int contarUsuarios = Usuario.usuarioBD.size();
        String msj = "Este usuario fue guardado con exito\n"
                + "Existen " + contarUsuarios + " Usuarios";
                    JOptionPane.showMessageDialog(this, msj);
                    limpiarCampos();
   
            
        }
       
        //guardamos el usuario en MAP
        
        

    }//GEN-LAST:event_botonGuardarActionPerformed

    public void limpiarCampos(){
    
        campoCedula.setText("");
        campoNombre.setText("");
        campoClave.setText("");
        campoEmail.setText("");
        campoTelefono.setText("");
        
    }
    
    private void campoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea cerrar?"
                , "OJO - CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcion == JOptionPane.YES_OPTION){
            this.dispose();
        }
        
    }//GEN-LAST:event_botonCancelarActionPerformed
//(this,"¿Desea cerrar?"int opcion = JOptionPane.showConfirmDialog(this,"¿Desea cerrar?"
               // "OJO - CONFIRMAR", JOptionpane.);
                
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
            java.util.logging.Logger.getLogger(PantallaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaUsuarios dialog = new PantallaUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JPasswordField campoClave;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
