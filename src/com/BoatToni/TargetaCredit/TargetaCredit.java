/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.TargetaCredit;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class TargetaCredit {

    private int numero;
    private int mes;
    private int any;
    private int codiVerificacio;

    public TargetaCredit(int numero, int mes, int any, int codiVerificacio) {
        this.numero = numero;
        this.mes = mes;
        this.any = any;
        this.codiVerificacio = codiVerificacio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getCodiVerificacio() {
        return codiVerificacio;
    }

    public void setCodiVerificacio(int codiVerificacio) {
        this.codiVerificacio = codiVerificacio;
    }

    @Override
    public String toString() {
        return "TargetaCredit{" + "numero=" + numero + ", mes=" + mes + ", any=" + any + ", codiVerificacio=" + codiVerificacio + '}';
    }

}
