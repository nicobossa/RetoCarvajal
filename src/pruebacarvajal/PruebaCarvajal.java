/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacarvajal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        int e = 1;
        ArrayList<range> rangos = new ArrayList<range>();
        
        while (e != 0) {
            int start = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor inicial de la linea."));
            int end = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor inicial de la linea."));
            rangos.add(new range(start, end));
            e = Integer.parseInt(JOptionPane.showInputDialog("Desea conocer los nuevos rangos? Responda con 0 para SI"));
        }

        ArrayList<range> nuevosranges = ejercicio.nuevosRangos(rangos);
        rangos.forEach(item -> System.out.println(item));
    }
}
