/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Persona;

import com.BoatToni.Exceptions.PersonaException;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Patro extends Persona {

    private String titulacio;
    private double preuPatro;

    public Patro(String titulacio, double preuPatro, String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça) throws PersonaException {
        super(nom, llinatges, numDocument, document, email, telefon, adreça);
        this.titulacio = titulacio;
        this.preuPatro = preuPatro;
    }

    public String getTitulacio() {
        return titulacio;
    }

    public void setTitulacio(String titulacio) {
        this.titulacio = titulacio;
    }

    public double getPreuPatro() {
        return preuPatro;
    }

    public void setPreuPatro(double preuPatro) {
        this.preuPatro = preuPatro;
    }

    @Override
    public String toString() {
        return "Patro{" + "nom= " + nom + "llinatges= " + llinatges + "tipusDocument= " + document + "numDocument= " + numDocument + "adreça= " + adreça + "email= " + email + "telefon= " + telefon + "titulacio=" + titulacio + ", preuPatro=" + preuPatro + '}';
    }

}
