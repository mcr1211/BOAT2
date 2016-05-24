/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Operacions;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Operacio {

    protected int id;
    protected Estat estat;

    public Operacio(Estat estat) {
        this.id = id;
        this.estat = estat;
        int contador = 0;
        id = contador++;
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
