/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Operacions;

import com.BoatToni.Exceptions.ReparacioException;
import com.BoatToni.Persona.Client;
import com.BoatToni.Persona.Taller;
import com.BoatToni.Vaixell.Vaixell;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Reparacio extends Operacio {

    private Client amo;
    private Vaixell vaixell;
    private ArrayList<Taller> treballadors;
    private String llocReparacio;
    private Date dataIniciReparacio;
    private String descripcio;
    private double preuFactura;

    public Reparacio(Client propietari, Vaixell vaixell, String llocReparacio, Date dataInici, String descripcio, double preuPresupost, Estat estat) throws ReparacioException {
        super(estat);
        
        this.amo = amo;
        this.vaixell = vaixell;
        this.treballadors = treballadors;
        this.llocReparacio = llocReparacio;
        if("".equals(dataInici)){
            throw new ReparacioException("Has de posar una dataInici de reparacio.");
        }else {
            this.dataIniciReparacio = dataInici;
        }
        this.descripcio = descripcio;
        if("".equals(preuFactura)){
            throw new ReparacioException("Has de posar un valor a la factura.");
        }else {
            this.preuFactura = preuFactura;
        }
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public ArrayList<Taller> getTreballadors() {
        return treballadors;
    }

    public String getLlocReparacio() {
        return llocReparacio;
    }

    public Date getDataIniciReparacio() {
        return dataIniciReparacio;
    }


    public String getDescripcio() {
        return descripcio;
    }

    public double getPreuFactura() {
        return preuFactura;
    }

    public void setLlocReparacio(String llocReparacio) {
        this.llocReparacio = llocReparacio;
    }

    public void setDataIniciReparacio(Date dataIniciReparacio) {
        this.dataIniciReparacio = dataIniciReparacio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setPreuFactura(double preuFactura) {
        this.preuFactura = preuFactura;
    }

    public void afegirTreballador(Taller t) {
        treballadors.add(t);
    }

    public void eliminarTreballador(Taller t) {
        treballadors.remove(t);
    }

    @Override
    public String toString() {
        return "Reparacio {" + " propietari= " + amo + ", vaixell= " + vaixell + ", treballadors= " + treballadors + ", llocReparacio= " + llocReparacio + ", dataIniciReparacio= " + dataIniciReparacio + ", descripcio= " + descripcio + ", preuFactura= " + preuFactura + '}';
    }

}
