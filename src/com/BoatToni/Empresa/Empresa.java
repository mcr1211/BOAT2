package com.BoatToni.Empresa;

import com.BoatToni.Exceptions.LlistesException;
import com.BoatToni.Operacions.Estat;
import com.BoatToni.Operacions.Lloguer;
import com.BoatToni.Operacions.Reparacio;
import com.BoatToni.Operacions.Venda;
import com.BoatToni.Persona.Client;
import com.BoatToni.Persona.Comercial;
import com.BoatToni.Persona.Patro;
import com.BoatToni.Persona.Taller;
import com.BoatToni.Vaixell.Model;
import com.BoatToni.Vaixell.Vaixell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Empresa {

    private HashMap<Integer, Model> llistaModels;
    private HashMap<String, Vaixell> llistaVaixell;
    private HashMap<String, Client> llistaClient;
    private HashMap<String, Comercial> llistaComercial;
    private HashMap<String, Taller> llistaTaller;
    private HashMap<String, Patro> llistaPatro;
    private HashMap<Integer, Reparacio> llistaReparacions;
    private HashMap<Integer, Venda> llistaVenda;
    private HashMap<Integer, Lloguer> llistaLloguer;

    public Empresa() {
        llistaModels = new HashMap<>();
        llistaVaixell = new HashMap<>();
        llistaClient = new HashMap<>();
        llistaTaller = new HashMap<>();
        llistaPatro = new HashMap<>();
        llistaReparacions = new HashMap<>();
        llistaVenda = new HashMap<>();
    }

    public HashMap<Integer, Model> getLlistaModels() {
        return llistaModels;
    }

    public HashMap<String, Vaixell> getLlistaVaixell() {
        return llistaVaixell;
    }

    public HashMap<String, Client> getLlistaClient() {
        return llistaClient;
    }

    public HashMap<String, Comercial> getLlistaComercial() {
        return llistaComercial;
    }

    public HashMap<String, Taller> getLlistaTaller() {
        return llistaTaller;
    }

    public HashMap<String, Patro> getLlistaPatro() {
        return llistaPatro;
    }

    public HashMap<Integer, Reparacio> getLlistaReparacions() {
        return llistaReparacions;
    }

    public HashMap<Integer, Venda> getLlistaVenda() {
        return llistaVenda;
    }

    public HashMap<Integer, Lloguer> getLlistaLloguer() {
        return llistaLloguer;
    }

    // Metodes per efegir i eliminar diferents objectes.
    public void afegirModel(Model model) {
        llistaModels.put(model.getIdModel(), model);
    }

    public void eliminarModel(int idModel) {
        llistaModels.remove(idModel);
    }

    public void afegirVaixell(Vaixell vaixell) {
        llistaVaixell.put(vaixell.getMatricula(), vaixell);
    }

    public void eliminarVaixell(String matricula) {
        llistaVaixell.remove(matricula);
    }

    public void afegirClient(Client client) {
        llistaClient.put(client.getNumDocument(), client);
    }

    public void eliminarClient(String numDocument) {
        llistaClient.remove(numDocument);
    }

    public void afegirPatro(Patro patro) {
        llistaPatro.put(patro.getNumDocument(), patro);
    }

    public void eliminarPatro(String numDocument) {
        llistaPatro.remove(numDocument);
    }

    public void afegirComercial(Comercial comercial) {
        llistaComercial.put(comercial.getNumDocument(), comercial);
    }

    public void eliminarComercial(String numDocument) {
        llistaComercial.remove(numDocument);
    }

    public void afegirTaller(Taller taller) {
        llistaTaller.put(taller.getNumDocument(), taller);
    }

    public void eliminarTaller(String numDocument) {
        llistaTaller.remove(numDocument);
    }

    public void afegirVenda(Venda venda) {
        llistaVenda.put(venda.getId(), venda);
    }

    public void eliminarVenda(int id) {
        llistaVenda.remove(id);
    }

    public void afegirReparacio(Reparacio reparacio) {
        llistaReparacions.put(reparacio.getId(), reparacio);
    }

    public void eliminarReparacio(int id) {
        llistaReparacions.remove(id);
    }

    public void afegirLloguer(Lloguer lloguer) {
        llistaLloguer.put(lloguer.getId(), lloguer);
    }

    public void eliminarLloguer(int id) {
        llistaLloguer.remove(id);
    }

    //Llistar tots els models.
    public HashMap<Integer, Model> totsModels() {
        return llistaModels;
    }

    //Llistar models per tipus de model.
    public ArrayList<Model> tipusModels(Model tipus) throws LlistesException {
        ArrayList<Model> tipusEmb = new ArrayList();

        Iterator it = llistaVaixell.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            if (tipusEmb.getClass().equals(llistaVaixell.getClass())) {

                tipusEmb.add(tipus);
            }
        }
        if (tipusEmb.isEmpty()) {
            throw new LlistesException("La llista està buida");
        }
        return tipusEmb;
    }

    // Llistar models per interval de preu.
    public HashMap modelsPreu(double petit, double gran) {
        HashMap<Integer, Model> preu = new HashMap<>();
        for (Model m : llistaModels.values()) {
            if (m.getPreu() >= petit && m.getPreu() <= gran) {
                preu.put(m.getIdModel(), m);
            }
        }
        return preu;
    }

    //Llista reparacions pendents.
    public ArrayList llistaReparacionsPendets() throws LlistesException {
        ArrayList<Reparacio> llistaPendent = new ArrayList();
        if (llistaReparacions.isEmpty()) {
            throw new LlistesException();
        } else {
            for (Reparacio r : llistaReparacions.values()) {
                if (r.getEstat() == Estat.PENDENT) {
                    llistaPendent.add(r);
                }
            }
            return llistaPendent;
        }
    }

    //Llista reparacions aturades.
    public ArrayList llistaReparacionsAturades() throws LlistesException {
        ArrayList<Reparacio> llistaAturades = new ArrayList();
        if (llistaReparacions.isEmpty()) {
            throw new LlistesException();
        } else {
            for (Reparacio r : llistaReparacions.values()) {
                if (r.getEstat() == Estat.ATURAT) {
                    llistaAturades.add(r);
                }
            }
            return llistaAturades;
        }
    }

    //Llista reparacions.
    public ArrayList llistatReparacions() throws LlistesException {
        ArrayList<Reparacio> llistatReparacions = new ArrayList();
        if (llistaReparacions.isEmpty()) {
            throw new LlistesException();
        } else {
            for (Reparacio r : llistaReparacions.values()) {
                llistatReparacions.add(r);
            }
            return llistatReparacions;
        }
    }
}