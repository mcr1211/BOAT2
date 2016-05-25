/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Persona;

import com.BoatToni.TargetaCredit.TargetaCredit;
import com.BoatToni.Exceptions.PersonaException;
import java.io.Serializable;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Client extends Persona {

    private TargetaCredit targeta;
    private String compteCorrent;

    public Client(String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça, String compteCorrent, TargetaCredit targeta) throws PersonaException {
        super(nom, llinatges, numDocument, document, email, telefon, adreça);
        this.compteCorrent = compteCorrent;
        this.targeta = targeta;
    }

    public Client(String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça, TargetaCredit targeta) throws PersonaException {
        super(nom, llinatges, numDocument, document, email, telefon, adreça);
        this.targeta = targeta;
        this.compteCorrent = null;
    }

    public Client(String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça, String compteCorrent) throws PersonaException {
        super(nom, llinatges, numDocument, document, email, telefon, adreça);
        this.compteCorrent = compteCorrent;
        this.targeta = null;
    }

    public TargetaCredit getTargeta() {
        return targeta;
    }

    public void setTargeta(TargetaCredit targeta) {
        this.targeta = targeta;
    }

    public String getCompteCorrent() {
        return compteCorrent;
    }

    public void setCompteCorrent(String compteCorrent) {
        this.compteCorrent = compteCorrent;
    }

    @Override
    public String toString() {
        return "Client{" + "nom= " + nom + "llinatges= " + llinatges + "tipusDocument= " + document + "numDocument= " + numDocument + "adreça= " + adreça + "email= " + email + "telefon= " + telefon + "targeta= " + targeta + ", compteCorrent= " + compteCorrent + '}';
    }

}
