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
public class Motora extends Model {

    private int potencia;
    private int volumDiposit;
    private boolean motorAuxiliar;

    public Motora(int potencia, int volumDiposit, boolean motorAuxiliar, String marca, String model, double manega, double eslora, double calat, double preu) {
        super(marca, model, manega, eslora, calat, preu);
        this.potencia = potencia;
        this.volumDiposit = volumDiposit;
        this.motorAuxiliar = motorAuxiliar;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVolumDiposit() {
        return volumDiposit;
    }

    public void setVolumDiposit(int volumDiposit) {
        this.volumDiposit = volumDiposit;
    }

    public boolean isMotorAuxiliar() {
        return motorAuxiliar;
    }

    public void setMotorAuxiliar(boolean motorAuxiliar) {
        this.motorAuxiliar = motorAuxiliar;
    }

    @Override
    public String toString() {
        return "Motora{" + "marca= " + marca + "model= " + model + "manega= " + manega + "eslora= " + eslora + "calat= " + calat + "preu=" + preu + "potencia=" + potencia + ", volumDiposit=" + volumDiposit + ", motorAuxiliar=" + motorAuxiliar + '}';
    }

}
