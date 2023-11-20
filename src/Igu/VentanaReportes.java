/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Igu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.aula.Usuario;

/**
 *
 * @author admin
 */
public class VentanaReportes extends javax.swing.JFrame {

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(operation); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
   
    public VentanaReportes(java.awt.Frame parent, boolean modal ) {
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
        initComponents();
    }
    
     private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
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
       
    }        
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
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
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           
       
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
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     VentanaUsuariosVerModificar you = new VentanaUsuariosVerModificar();
     
     you.setVisible(true);
     
     
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/Iconos/report256px.png"))); // NOI18N

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
