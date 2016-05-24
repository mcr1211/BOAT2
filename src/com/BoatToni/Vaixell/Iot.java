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
public class Iot extends Model {
   
    private int camarot;
    private int potencia;
    private int autonomia;
    private boolean bodega;

    public Iot(String marca, String model, double manega, double eslora, double calat, double preu, int camarot, int potencia, int autonomia, boolean bodega) {
        super(marca, model, manega, eslora, calat, preu);
        this.camarot = camarot;
        this.potencia = potencia;
        this.autonomia = autonomia;
        this.bodega = bodega;
    }

    public int getCamarot() {
        return camarot;
    }

    public void setCamarot(int camarot) {
        this.camarot = camarot;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    @Override
    public String toString() {
        return "Iot{" + "marca= " + marca + "model= " + model + "manega= " + manega + "eslora= " + eslora + "calat= " + calat + "preu= " + preu + "camarot=" + camarot + ", potencia=" + potencia + ", autonomia=" + autonomia + ", bodega=" + bodega + '}';
    }
    
    
}
