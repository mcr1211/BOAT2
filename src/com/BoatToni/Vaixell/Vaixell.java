/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Vaixell;

import com.BoatToni.Persona.Client;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Vaixell implements Serializable {

    private Date disponible;
    private String matricula;
    private boolean llogar;
    private double preuXdia;
    private Client propietari;
    private Model model;

    public Vaixell(Date disponible, String matricula, boolean llogar, double preuXdia, Client propietari, Model model) {
        this.disponible = disponible;
        this.matricula = matricula;
        this.llogar = llogar;
        this.preuXdia = preuXdia;
        this.propietari = propietari;
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isLlogar() {
        return llogar;
    }

    public void setLlogar(boolean llogar) {
        this.llogar = llogar;
    }

    public double getPreuXdia() {
        return preuXdia;
    }

    public void setPreuXdia(double preuXdia) {
        this.preuXdia = preuXdia;
    }

    public Client getPropietari() {
        return propietari;
    }

    public void setPropietari(Client propietari) {
        this.propietari = propietari;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Date getDisponible() {
        return disponible;
    }

    public void setDisponible(Date disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vaixell{" + "matricula=" + matricula + ", llogar=" + llogar + ", preuXdia=" + preuXdia + ", propietari=" + propietari + ", model=" + model + '}';
    }

}
