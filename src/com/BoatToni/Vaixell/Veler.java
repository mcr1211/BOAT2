/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Vaixell;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Veler extends Model {

    private int numCasc;
    private int numPals;
    private int numCabines;

    public Veler(int numCasc, int numPals, int numCabines, String marca, String model, double manega, double eslora, double calat, double preu) {
        super(marca, model, manega, eslora, calat, preu);
        this.numCasc = numCasc;
        this.numPals = numPals;
        this.numCabines = numCabines;
    }

    public int getNumCasc() {
        return numCasc;
    }

    public void setNumCasc(int numCasc) {
        this.numCasc = numCasc;
    }

    public int getNumPals() {
        return numPals;
    }

    public void setNumPals(int numPals) {
        this.numPals = numPals;
    }

    public int getNumCabines() {
        return numCabines;
    }

    public void setNumCabines(int numCabines) {
        this.numCabines = numCabines;
    }

    @Override
    public String toString() {
        return "Veler{" + "marca= " + marca + "model= " + model + "manega= " + manega + "eslora= " + eslora + "calat= " + calat + "preu= " + preu + "numCasc=" + numCasc + ", numPals=" + numPals + ", numCabines=" + numCabines + '}';
    }

}
