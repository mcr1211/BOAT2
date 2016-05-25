/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Operacions;

import java.io.Serializable;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Operacio implements Serializable {

    protected int id;
    protected Estat estat;
    protected static int contador = 1;

    public Operacio(Estat estat) {
        this.id = contador;
        this.estat = estat;
        contador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

}
