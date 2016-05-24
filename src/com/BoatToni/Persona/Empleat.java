/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Persona;

import com.BoatToni.Exceptions.EmpleatException;
import com.BoatToni.Exceptions.PersonaException;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Empleat extends Persona {

    protected Date dataAlta;
    protected double souEmpleat;

    public Empleat(Date dataAlta, double souEmpleat, String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça) throws PersonaException, EmpleatException {
        super(nom, llinatges, numDocument, document, email, telefon, adreça);
        this.dataAlta = dataAlta;
        if (souEmpleat < 600) {
            throw new EmpleatException();
        } else {
            this.souEmpleat = souEmpleat;
        }
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) throws EmpleatException {
        if(dataAlta==null){
            throw new EmpleatException();
        }else{
            this.dataAlta = dataAlta;
        }
        
    }

    public double getSouEmpleat() {
        return souEmpleat;
    }

    public void setSouEmpleat(double souEmpleat) {
        this.souEmpleat = souEmpleat;
    }

}
