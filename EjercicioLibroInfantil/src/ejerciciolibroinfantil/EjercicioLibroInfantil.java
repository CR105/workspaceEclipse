/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciolibroinfantil;

/**
 *
 * @author udemy
 */
public class EjercicioLibroInfantil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LibroInfantil l = new LibroInfantil();

        l.setEdadRecomendada(5);
        l.numPaginas = 3;
        
        if( l.esRecomendable(7) ){
        	System.out.println("Recomendable");
        	System.out.println("Num pag " + l.getNumPaginas());
        }
        else {
        	System.out.println("NO recomendable");
        }
            
    }
    
}
