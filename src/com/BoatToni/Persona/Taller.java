package com.BoatToni.Persona;

import com.BoatToni.Empresa.Empresa;
import com.BoatToni.Exceptions.EmpleatException;
import com.BoatToni.Exceptions.PersonaException;
import com.BoatToni.Exceptions.TallerException;
import com.BoatToni.Operacions.Venda;
import com.BoatToni.Vaixell.Model;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Taller extends Empleat {

    private ArrayList<Habilitat> skill;
    private double souTaller;

    public Taller(String nom, String llinatges, String numDocument, Document document, String email, long telefon, String adreça, Date dataAlta, double souEmpleat, Habilitat skill) throws PersonaException, EmpleatException {
        super(dataAlta, souEmpleat, nom, llinatges, numDocument, document, email, telefon, adreça);
        this.skill = new ArrayList<>();
    }

    public double ferNomina(Empleat empleat) {
        souTaller = empleat.getSouEmpleat();
        return souTaller;
    }
    
    public void afegirSkill (Habilitat h) throws TallerException{
        if (skill.lastIndexOf(h)!=-1){
            throw new TallerException("L'habilitat no s'ha afegit.");
        }else {
            skill.add(h);
        }
    }
    
    public void eliminarSkill (Habilitat h) throws TallerException{
        if (skill.contains(h)){
            skill.remove(h);
        }else {
            throw new TallerException("L'habilitat no s'ha borrat.");
        }
    }
    
    public ArrayList mostraSkills(){
        return skill;
    }

    @Override
    public String toString() {
        return "Taller{"+ "nom= " + nom + "llinatges= " + llinatges + "tipusDocument= " + document + "numDocument= " + numDocument + "adreça= " + adreça + "email= " + email + "telefon= " + telefon + "dataAlta= " + dataAlta + "Habilitat/s= " + skill + "souTaller= " + souTaller + '}';
    }
    
    
}
