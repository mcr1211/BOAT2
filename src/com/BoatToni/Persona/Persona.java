package com.BoatToni.Persona;

import com.BoatToni.Exceptions.PersonaException;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Persona {

    protected String nom;
    protected String llinatges;
    protected String numDocument;
    protected Document document;
    protected String email;
    protected long telefon;
    protected String adreça;

    public Persona(String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça) throws PersonaException {
        if (nom.isEmpty()) {
            throw new PersonaException();
        } else {
            this.nom = nom;
        }
        if (llinatges.isEmpty()) {
            throw new PersonaException();
        } else {
            this.llinatges = llinatges;
        }
        if (numDocument.isEmpty()) {
            throw new PersonaException();
        } else {
            this.numDocument = numDocument;
        }
        this.document = document;
        this.email = email;
        this.telefon = telefon;
        this.adreça = adreça;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatges() {
        return llinatges;
    }

    public void setLlinatges(String llinatges) {
        this.llinatges = llinatges;
    }

    public String getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(String numDocument) {
        this.numDocument = numDocument;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }
}
