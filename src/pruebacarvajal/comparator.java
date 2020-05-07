/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacarvajal;

import java.util.Comparator;

/**
 *
 * @author nicom
 */
public class comparator implements Comparator<range> {
    @Override
    public int compare(range rango1, range rango2) {
                return new Integer(rango1.getInicio()).compareTo(rango2.getInicio());
            }
}
