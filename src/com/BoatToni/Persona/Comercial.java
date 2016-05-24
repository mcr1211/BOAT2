package com.BoatToni.Persona;

import com.BoatToni.Empresa.Empresa;
import com.BoatToni.Exceptions.EmpleatException;
import com.BoatToni.Exceptions.PersonaException;
import com.BoatToni.Operacions.Venda;
import com.BoatToni.Vaixell.Model;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Comercial extends Empleat {

    private int comissio;
    private double souComercial;

    public Comercial(String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça, Date dataAlta, double souEmpleat, int comissio) throws PersonaException, EmpleatException {
        super(dataAlta, souEmpleat, nom, llinatges, numDocument, document, email, telefon, adreça);
        this.comissio = comissio;
    }

    public int getComissio() {
        return comissio;
    }

    public void setComissio(int comissio) {
        this.comissio = comissio;
    }

    public double getSouComercial() {
        return souComercial;
    }

    public double ferNomina(Empresa empresa,Comercial comercial, Model model) {
        ArrayList<Venda> vendesComercial = new ArrayList<>();
        if (empresa.getLlistaVenda().containsKey(comercial.getNumDocument())) {
            for (Venda d : empresa.getLlistaVenda().values()) {
                souComercial = comercial.getSouEmpleat()* (model.getPreu() * comercial.getComissio() / 100);
            }
        }
        return souComercial;
    }

    @Override
    public String toString() {
        return "Comercial{"+ "nom= " + nom + "llinatges= " + llinatges + "tipusDocument= " + document + "numDocument= " + numDocument + "adreça= " + adreça + "email= " + email + "telefon= " + telefon + "dataAlta= " + dataAlta + "comissio=" + comissio + ", souComercial=" + souComercial + '}';
    }
    
    
}
