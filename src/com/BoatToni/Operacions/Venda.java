/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Operacions;

import com.BoatToni.Persona.Client;
import com.BoatToni.Persona.Comercial;
import com.BoatToni.Vaixell.Vaixell;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Venda extends Operacio {
    
    private Vaixell vaixell;
    private Date dataVenda;
    private double preu;
    private Client comprador;
    private Comercial comercial;

    public Venda(Vaixell vaixell, Date dataVenda, double preu, Client comprador, Comercial comercial, int id, Estat estat) {
        super(estat);
        this.vaixell = vaixell;
        this.dataVenda = dataVenda;
        this.preu = preu;
        this.comprador = comprador;
        this.comercial = comercial;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public double getPreu() {
        return preu;
    }

    public Client getComprador() {
        return comprador;
    }

    public Comercial getComercial() {
        return comercial;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Venda{" + "vaixell=" + vaixell + ", dataVenda=" + dataVenda + ", preu=" + preu + ", comprador=" + comprador + ", comercial=" + comercial + '}';
    }
    
    
}
