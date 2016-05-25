/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.TargetaCredit;

import com.BoatToni.Exceptions.TargetaException;
import java.io.Serializable;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class TargetaCredit implements Serializable{

    private int numero;
    private int mes;
    private int any;
    private int codiVerificacio;

    public TargetaCredit(int numero, int mes, int any, int codiVerificacio) throws TargetaException {
        if ("".equals(numero)){
            throw new TargetaException("Posa un numero de targeta");
        }else {
            this.numero = numero;
        }
        if ("".equals(mes)){
            throw new TargetaException("Posa un mes amb dos digits");
        }else {
            this.mes = mes;
        }
        if("".equals(any)){
            throw new TargetaException("Posa un any amb dos digits");
        }else {
            this.any = any;
        }
        if("".equals(codiVerificacio)){
            throw new TargetaException("Posa un codi de verificacio de la targeta de tres digits.");
        }else {
            this.codiVerificacio = codiVerificacio;
        }        
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
