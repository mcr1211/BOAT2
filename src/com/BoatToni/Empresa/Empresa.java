package com.BoatToni.Empresa;

import com.BoatToni.Exceptions.EmpresaException;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Empresa {

    private String nom;
    private HashMap<Integer, Model> llistaModels;
    private HashMap<String, Vaixell> llistaVaixell;
    private HashMap<String, Client> llistaClient;
    private HashMap<String, Comercial> llistaComercial;
    private HashMap<String, Taller> llistaTaller;
    private HashMap<String, Patro> llistaPatro;
    private HashMap<Integer, Reparacio> llistaReparacions;
    private HashMap<Integer, Venda> llistaVenda;
    private HashMap<Integer, Lloguer> llistaLloguer;

    public Empresa(String nom) {
        llistaModels = new HashMap<>();
        llistaVaixell = new HashMap<>();
        llistaClient = new HashMap<>();
        llistaTaller = new HashMap<>();
        llistaPatro = new HashMap<>();
        llistaReparacions = new HashMap<>();
        llistaVenda = new HashMap<>();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public void afegirVaixell(Vaixell vaixell) throws EmpresaException {
        if (llistaVaixell.containsKey(vaixell.getMatricula())) {
            throw new EmpresaException("No s'ha afegit el vaixell.");
        } else {
            llistaVaixell.put(vaixell.getMatricula(), vaixell);
        }
    }

    public void eliminarVaixell(String matricula) throws EmpresaException {
        if (llistaVaixell.containsKey(matricula)) {
            llistaVaixell.remove(matricula);
        } else {
            throw new EmpresaException("No s'ha borrat el vaixell.");
        }
    }

    public void afegirClient(Client client) throws EmpresaException {
        if (llistaClient.containsKey(client.getNumDocument())) {
            throw new EmpresaException("No s'ha afegit el client.");
        } else {
            llistaClient.put(client.getNumDocument(), client);
        }
    }

    public void eliminarClient(String numDocument) throws EmpresaException {
        if (llistaClient.containsKey(numDocument)) {
            llistaClient.remove(numDocument);
        } else {
            throw new EmpresaException("No s'ha borrat el client.");
        }
    }

    public void afegirPatro(Patro patro) throws EmpresaException {
        if (llistaPatro.containsKey(patro.getNumDocument())) {
            throw new EmpresaException("No s'ha afegit el patró.");
        } else {
            llistaPatro.put(patro.getNumDocument(), patro);
        }
    }

    public void eliminarPatro(String numDocument) throws EmpresaException {
        if (llistaPatro.containsKey(numDocument)) {
            llistaPatro.remove(numDocument);
        } else {
            throw new EmpresaException("No s'ha borrat el patró.");
        }
    }

    public void afegirComercial(Comercial comercial) throws EmpresaException {
        if (llistaComercial.containsKey(comercial.getNumDocument())) {
            throw new EmpresaException("No s'ha afegit el comercial.");
        } else {
            llistaComercial.put(comercial.getNumDocument(), comercial);
        }
    }

    public void eliminarComercial(String numDocument) throws EmpresaException {
        if (llistaComercial.containsKey(numDocument)) {
            llistaComercial.remove(numDocument);
        } else {
            throw new EmpresaException("No s'ha borrat el comercial.");
        }
    }

    public void afegirTaller(Taller taller) throws EmpresaException {
        if (llistaTaller.containsKey(taller.getNumDocument())) {
            throw new EmpresaException("No s'ha afegit el treballador que fa feina al taller.");
        } else {
            llistaTaller.put(taller.getNumDocument(), taller);
        }
    }

    public void eliminarTaller(String numDocument) throws EmpresaException {
        if (llistaTaller.containsKey(numDocument)) {
            llistaTaller.remove(numDocument);
        } else {
            throw new EmpresaException("No s'ha borrat el treballador que fa feina al taller");
        }
    }

    public void afegirVenda(Venda venda) throws EmpresaException {
        if (llistaVenda.containsKey(venda.getId())) {
            throw new EmpresaException("No s'ha afegit la venda.");
        } else {
            llistaVenda.put(venda.getId(), venda);
        }
    }

    public void eliminarVenda(int id) throws EmpresaException {
        if (llistaVenda.containsKey(id)) {
            llistaVenda.remove(id);
        } else {
            throw new EmpresaException("No s'ha borrat la venda.");
        }
    }

    public void afegirReparacio(Reparacio reparacio) throws EmpresaException {
        if (llistaReparacions.containsKey(reparacio.getId())) {
            throw new EmpresaException("No s'ha afegit la reparacio.");
        } else {
            llistaReparacions.put(reparacio.getId(), reparacio);
        }
    }

    public void eliminarReparacio(int id) throws EmpresaException {
        if (llistaReparacions.containsKey(id)) {
            llistaReparacions.remove(id);
        } else {
            throw new EmpresaException("No s'ha borrat la reparacio.");
        }
    }

    public void afegirLloguer(Lloguer lloguer) throws EmpresaException {
        if (llistaLloguer.containsKey(lloguer.getId())) {
            throw new EmpresaException("No s'ha afegit el lloguer.");
        } else {
            llistaLloguer.put(lloguer.getId(), lloguer);
        }
    }

    public void eliminarLloguer(int id) throws EmpresaException {
        if (llistaLloguer.containsKey(id)){
        llistaLloguer.remove(id);
        }else {
            throw new EmpresaException("No s'ha borrat el lloguer.");
        }
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


    @Override
    public String toString() {
        return "Empresa{" + "nom=" + nom + '}';
    }


    //Llista lloguer disponible entre dos dies.
    public ArrayList llistaLloguerDies(Date dataInici, Date datafi) throws LlistesException {
        ArrayList<Lloguer> llistatLloguerDies = new ArrayList();
        if (llistaLloguer.isEmpty()) {
            throw new LlistesException("Llista buida.");
        } else {
            for (Lloguer l : llistaLloguer.values()) {
                if (l.getDataInici().after(datafi) && l.getDataFi().before(datafi)) {
                    throw new LlistesException("Data incorrecte.");
                } else {
                    llistatLloguerDies.add(l);
                }
            }
            return llistatLloguerDies;
        }
    }

}
