/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacarvajal;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Bossa
 */
public class PruebaCarvajal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        logic ejercicio = new logic();
        ArrayList<range> rangos = new ArrayList<range>();
        rangos.add(new range(2, 3));
        rangos.add(new range(1, 4));
        
        ArrayList<range> nuevosranges = ejercicio.obtenerNuevosranges(rangos);
        for (range rango : nuevosranges) {
            System.out.println(rango.toString());
        }
    }
}


