/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplobombilla;

/**
 *
 * @author udemy
 */
public class EjemploBombilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bombilla b = new Bombilla();
        
        b.consultarEstado();
        b.encender();
        b.consultarEstado();
        b.apagar();
        b.consultarEstado();
        
    }
    
}
