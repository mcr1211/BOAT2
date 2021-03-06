/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Operacions;

import com.BoatToni.Exceptions.LloguerException;
import com.BoatToni.Persona.Client;
import com.BoatToni.Persona.Patro;
import com.BoatToni.Vaixell.Vaixell;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Lloguer extends Operacio {

    private Date dataInici;
    private Date dataFi;
    private Client client;
    private Vaixell vaixell;
    private double preuXDia;
    private Patro patro;
    private double preuLloguer;
    private boolean ppatro;

    public Lloguer(Date dataInici, Date dataFi, Client client, Vaixell vaixell, double preuXDia, Patro patro, double preuLloguer, int id, Estat estat) {
        super(estat);
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.client = client;
        this.vaixell = vaixell;
        this.preuXDia = preuXDia;
        this.patro = patro;
        this.preuLloguer = preuLloguer;
    }

    public Lloguer(Date dataInici, Date dataFi, Client client, Vaixell vaixell, double preuXDia, Patro patro, double preuLloguer, boolean ppatro, Estat estat) {
        super(estat);
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.client = client;
        this.vaixell = vaixell;
        this.preuXDia = preuXDia;
        this.patro = patro;
        this.preuLloguer = preuLloguer;
        this.ppatro = ppatro;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public Date getDataFi() {
        return dataFi;
    }

    public Client getClient() {
        return client;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public double getPreuXDia() {
        return preuXDia;
    }

    public Patro getPatro() {
        return patro;
    }

    public double getPreuLloguer() {
        return preuLloguer;
    }

    public boolean isPpatro() {
        return ppatro;
    }
    
    public void setDataInici(Date dataInici) throws LloguerException {
        if (dataInici.after(dataFi)) {
            throw new LloguerException("La data d'inici es erronea.");
        } else {
            this.dataInici = dataInici;
        }
    }

    public void setDataFi(Date dataFi) throws LloguerException {
        if (dataFi.before(dataInici)) {
            throw new LloguerException("La data fi es erronea.");
        } else {
            this.dataFi = dataFi;
        }
    }

    public void setPpatro(boolean ppatro) {
        this.ppatro = ppatro;
    }

    public int diesLloguer(Date inici, Date fi) {
        long dataInici = inici.getTime();
        long dataFi = fi.getTime();
        long resta = dataInici - dataFi;
        int dies = (int) Math.floor(resta / (1000 * 60 * 60 * 24));
        return dies;
    }

    public void setPreuXDia(double preuXDia) throws LloguerException {
        if (preuXDia <= 0) {
            throw new LloguerException("Quantitat preu per dia introduïda erronea.");
        } else {
            this.preuXDia = preuXDia;
        }
    }

    public void preuLloguer() {
        int dies = diesLloguer(dataInici, dataFi);
        if (ppatro) {
            preuLloguer = dies * preuXDia + patro.getPreuPatro();
        } else {
            preuLloguer = dies * preuXDia;
        }
    }
    
    public double mostrarPreuLloguer(){
        return preuLloguer;
    }

    @Override
    public String toString() {
        return "Lloguer{" + "dataInici=" + dataInici + ", dataFi=" + dataFi + ", client=" + client + ", vaixell=" + vaixell + ", preuXDia=" + preuXDia + ", patro=" + patro + ", preuLloguer=" + preuLloguer + '}';
    }
}
