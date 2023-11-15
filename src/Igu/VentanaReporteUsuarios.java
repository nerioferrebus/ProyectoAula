/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Igu;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import proyecto.aula.Usuario;

/**
 *
 * @author Usuario
 */
public class VentanaReporteUsuarios extends javax.swing.JDialog {

    /**
     * Creates new form VentanaReporteUsuarios
     */
    public VentanaReporteUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
        model.setRowCount(0);

        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from clientes");

            while (rs.next()) {

                String id = rs.getString("ID");
                String cedula = rs.getString("CEDULA");
                String nombre = rs.getString("NOMBRE");
                String email = rs.getString("EMAIL");
                String telefono = rs.getString("TELEFONO");
                String fecha = rs.getString("FECHA");
                String habitacion = rs.getString("HABITACION");

                model.addRow(new Object[]{id, cedula, nombre, email, telefono, fecha, habitacion});
            }

            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("**Gestion de Usuarios**");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/iconos/report256px.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reporte de Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2), "Datos de los usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 16), new java.awt.Color(102, 0, 204))); // NOI18N

        tablaUsuarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "EMAIL", "TELEFONO", "FECHA", "HABITACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setEnabled(false);
        tablaUsuarios.setRowHeight(40);
        tablaUsuarios.setRowMargin(2);
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(220, 220, 220)
                        .addComponent(jButton3)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Collection <Usuario> datos = Usuario.usuarioBD.values();
        List<Usuario>listaUsuarios = new ArrayList ( datos);
                
        int totalUsuarios = listaUsuarios.size();
        String columnas [] = {"CEDULA", "NOMBRE", "EMAIL", "TELEFONO"};
        String filas[][] = new String [totalUsuarios][columnas.length];
        for(int i = 0; i < listaUsuarios.size(); i++ ){
           Usuario u = listaUsuarios.get(i);
           filas [i][0] = u.cedula;
           filas [i][1] = u.nombre;
           filas [i][2] = u.email;
           filas [i][3] = u.telefono;
        }
        DefaultTableModel datosTabla = new DefaultTableModel();
        datosTabla.setDataVector(filas, columnas);
        tablaUsuarios.setModel(datosTabla);
       
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            String cedulaAEliminar = JOptionPane.showInputDialog(null, "Ingrese la cédula del cliente a eliminar:");

            if (cedulaAEliminar != null && !cedulaAEliminar.isEmpty()) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar el cliente con cédula " + cedulaAEliminar + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {

                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
                    java.sql.PreparedStatement pst = cn.prepareStatement("delete from clientes where CEDULA = ?");
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
            
            DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
            model.setRowCount(0);


            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from clientes");

                while (rs.next()) {

                    String id = rs.getString("ID");
                    String cedula = rs.getString("CEDULA");
                    String nombre = rs.getString("NOMBRE");
                    String email = rs.getString("EMAIL");
                    String telefono = rs.getString("TELEFONO");
                    String fecha = rs.getString("FECHA");
                    String habitacion = rs.getString("HABITACION");

                    model.addRow(new Object[]{id, cedula, nombre, email, telefono, fecha, habitacion});
                }

                rs.close();
                stmt.close();
                conn.close();

            } catch (Exception e) {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
       
        try {
        // Mostrar un JOptionPane para obtener el ID
        String idStr = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:");

        // Verificar si el ID es numérico
        if (idStr != null && !idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);

            // Realizar la búsqueda en la base de datos
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            java.sql.PreparedStatement pst = cn.prepareStatement("select * from clientes where CEDULA = ?");
            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            // Verificar si se encontró algún resultado
            if (rs.next()) {
                // Mostrar la información del cliente encontrado
                String mensaje = "CLIENTE:\n"
                        + "ID: " + rs.getInt("id") + "\n"
                        + "Cedula: " + rs.getString("cedula") + "\n"
                        + "Nombre: " + rs.getString("nombre") + "\n"
                        + "Email: " + rs.getString("email") + "\n"
                        + "Teléfono: " + rs.getString("telefono") + "\n"
                        + "Fecha: " + rs.getString("fecha") + "\n"
                        + "Habitación: " + rs.getString("habitacion");

                JOptionPane.showMessageDialog(null, mensaje, "Cliente Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar un mensaje si no se encontró el ID
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el ID proporcionado.", "Cliente no Encontrado", JOptionPane.WARNING_MESSAGE);
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     VentanaUsuariosVerModificar you = new VentanaUsuariosVerModificar();
     
     you.setVisible(true);
     
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaReporteUsuarios dialog = new VentanaReporteUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel respuesta;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
