package com.BoatToni.Persona;

import com.BoatToni.Exceptions.PatroException;
import com.BoatToni.Exceptions.PersonaException;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Patro extends Persona {

    private String titulacio;
    private double preuPatro;

    public Patro(String titulacio, double preuPatro, String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça) throws PersonaException, PatroException {
        super(nom, llinatges, numDocument, document, email, telefon, adreça);
        if("".equals(titulacio)){
            throw new PatroException("Falta un titol de patro.");
        }else {
            this.titulacio = titulacio;
        }
        if (preuPatro<=0){
            throw new PatroException("El cost del patro és erroni.");
        }else {
            this.preuPatro = preuPatro;
        }
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
