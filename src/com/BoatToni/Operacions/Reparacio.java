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
    private Date dataInici;
    private Date dataPrevFinal;
    private String descripcio;
    private double preuFactura;

    public Reparacio(Client propietari, Vaixell vaixell, String llocReparacio, Date dataInici, Date dataPrevFinal, String descripcio, double preuPresupost, int id, Estat estat) throws ReparacioException {
        super(estat);
        this.amo = amo;
        this.vaixell = vaixell;
        this.treballadors = treballadors;
        this.llocReparacio = llocReparacio;
        if("".equals(dataInici)){
            throw new ReparacioException("Has de posar una dataInici de reparacio.");
        }else {
            this.dataInici = dataInici;
        }
        this.dataPrevFinal = dataPrevFinal;
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

    public Date getDataInici() {
        return dataInici;
    }

    public Date getDataPrevFinal() {
        return dataPrevFinal;
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

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public void setDataPrevFinal(Date dataPrevFinal) {
        this.dataPrevFinal = dataPrevFinal;
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
        return "Reparacio{" + "propietari=" + amo + ", vaixell=" + vaixell + ", treballadors=" + treballadors + ", llocReparacio=" + llocReparacio + ", dataInici=" + dataInici + ", dataPrevFinal=" + dataPrevFinal + ", descripcio=" + descripcio + ", preuFactura=" + preuFactura + '}';
    }

}
