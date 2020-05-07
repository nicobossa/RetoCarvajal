/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacarvajal;

/**
 *
 * @author nicom
 */
public class range {

    private int inicio;
    private int fin;

    public range(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "range{" + "inicio=" + inicio + ", fin=" + fin + '}';
    }

}
