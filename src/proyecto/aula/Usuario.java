/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.aula;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Usuario {
    public String cedula;
    public String clave;
    public String nombre;
    public String email;
    public String telefono;
    public ArrayList<Servicio>listadeservicios;
    public static HashMap<String,Usuario> usuarioBD;
    
}
