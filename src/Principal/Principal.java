
package Principal;

import Igu.Pantalla;

public class Principal {
   
    
    
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
    //pantalla.setLocationRelativeTo(pantalla);
                                        
    pantalla.setExtendedState(Pantalla.MAXIMIZED_BOTH);
    pantalla.setVisible(true);
    
    }
}
