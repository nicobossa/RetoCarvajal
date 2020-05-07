/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacarvajal;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nicom
 */
public class logic {

    public ArrayList<range> nuevosRangos(ArrayList<range> rangos) {
        range rango1, rango2, newR;
        Collections.sort(rangos, new comparator());

        for (int i = 0; i < rangos.size() - 1; i++) {
            rango1 = rangos.get(i);
            rango2 = rangos.get(i + 1);
            if (rango1.getFin() >= rango2.getInicio()) {
                if (rango1.getFin() > rango2.getFin()) {
                    newR = new range(rango1.getInicio(), rango1.getFin());
                } else {
                    newR = new range(rango1.getInicio(), rango2.getFin());
                }
                rangos.set(i, newR);
                rangos.remove(i + 1);
                i--;

            }
        }
        return rangos;
    }
}
