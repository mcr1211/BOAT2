/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatInc.Main;

import com.BoatInc.Main.json.utilitats.EinesJson;
import com.BoatInc.Main.json.utilitats.EinesObjectStream;
import com.BoatToni.Empresa.Empresa;
import com.BoatToni.Exceptions.EmpleatException;
import com.BoatToni.Exceptions.EmpresaException;
import com.BoatToni.Exceptions.LlistesException;
import com.BoatToni.Exceptions.PersonaException;
import com.BoatToni.Exceptions.ReparacioException;
import com.BoatToni.Operacions.Estat;
import com.BoatToni.Operacions.Reparacio;
import com.BoatToni.Persona.Client;
import com.BoatToni.Persona.Comercial;
import com.BoatToni.Persona.Document;
import com.BoatToni.Persona.Habilitat;
import com.BoatToni.Persona.Taller;
import com.BoatToni.Vaixell.Iot;
import com.BoatToni.Vaixell.Motora;
import com.BoatToni.Vaixell.Vaixell;
import com.BoatToni.Vaixell.Veler;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Elio
 */
public class Main {

    Empresa emp;

    public Empresa inici() throws ParseException, PersonaException, EmpleatException, EmpresaException, ReparacioException {
        Empresa emp = new Empresa("BoatsInc");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String data = "01-05-2016";
            Date d1 = sdf.parse(data);
            String data1 = "02-05-2016";
            Date d2 = sdf.parse(data1);
            String data2 = "03-05-2016";
            Date d3 = sdf.parse(data2);
            String data3 = "04-05-2016";
            Date d4 = sdf.parse(data3);
            String data4 = "05-05-2016";
            Date d5 = sdf.parse(data4);

            //**EMPLEATS COMERCIALS
//            Comercial venedor = new Comercial("Pau", "Ramis", "43111555K", Document.DNI, "pramis@gmail.com", 666999888, "C/Sol nº1", d2, 1200, 10);
//            Comercial venedor2 = new Comercial("Barbara", "Thomas", "42222222K", Document.DNI, "lamasguaoa@gmail.com", 666199888, "C/Sol nº2", d2, 1200, 10);
//            Comercial venedor3 = new Comercial("María", "Bennàssar", "43121555K", Document.DNI, "bennassar@gmail.com", 767979787, "C/Sol nº3", d2, 1200, 10);
//            Comercial venedor4 = new Comercial("Pep", "Fiol", "66111555K", Document.DNI, "pep87@gmail.com", 666999828, "C/Lluna nº1", d2, 1200, 10);
//            Comercial venedor5 = new Comercial("Tomeu", "Terrassa", "44454555K", Document.DNI, "tomeut@gmail.com", 676999448, "C/Major nº4", d2, 1200, 10);
//
//            emp.afegirComercial(venedor);
//            emp.afegirComercial(venedor2);
//            emp.afegirComercial(venedor3);
//            emp.afegirComercial(venedor4);
//            emp.afegirComercial(venedor5);
//            emp.getLlistaComercial();

            // **EMPLEATS DE TALLER**
            Taller tecnic = new Taller("Biel", "Recio", "43194116Y", Document.DNI, "bielrecio@gmail.com", 620354388, "C/Sol nº50", d1, 900, Habilitat.ELECTRICITAT);
            Taller tecnic2 = new Taller("Tomas", "Armengol", "43195119U", Document.DNI, "tomasarmengol@yahoo.es", 621364489, "C/Sol nº51", d1, 900, Habilitat.FUSTERIA);
            Taller tecnic3 = new Taller("Mario", "Pérez", "43198129U", Document.DNI, "chulo69@hotmail.com", 621364500, "C/Aragón nº351", d1, 900, Habilitat.FUSTERIA);
            Taller tecnic4 = new Taller("Biel", "Ramis", "45554116P", Document.DNI, "bielr@hotmail.com", 600304080, "C/Lluna nº50", d1, 900, Habilitat.MECANICA);
            Taller tecnic5 = new Taller("Toni", "Fiol", "40105010U", Document.DNI, "tonifiol@yahoo.es", 622224444, "C/Garriga nº51", d1, 900, Habilitat.VELA);

            emp.afegirTaller(tecnic);
            emp.afegirTaller(tecnic2);
            emp.afegirTaller(tecnic3);
            emp.afegirTaller(tecnic4);
            emp.afegirTaller(tecnic5);

            // **MODELS**
            Iot iot1 = new Iot("H2 Yacht Design", "Mars", 80, 30, 15, 1600000, 25, 3000, 90, true);
            Iot iot2 = new Iot("Isa yachts", "Yara", 46.73, 8.85, 2.16, 60000000, 10, 1500, 50, true);
            Iot iot3 = new Iot("HDW", "Al Salamah", 80, 30, 15, 20000, 25, 3000, 190, true);
            Iot iot4 = new Iot("Blohm & Voss", "A", 80, 30, 15, 323000000, 25, 3000, 90, true);
            Iot iot5 = new Iot("Blohm & Voss", "Serene", 80, 30, 15, 33000000, 25, 3000, 90, true);

            emp.afegirModel(iot1);
            emp.afegirModel(iot2);
            emp.afegirModel(iot3);
            emp.afegirModel(iot4);
            emp.afegirModel(iot5);

            Veler veler1 = new Veler(1, 3, 2, "Jeanneau", "La pinta", 20, 10, 9, 2000);
            Veler veler2 = new Veler(1, 3, 2, "Bénéteau", "Mar", 12, 10, 9, 200000);
            Veler veler3 = new Veler(1, 3, 2, "Sea Ray", "Neptuno", 10, 10, 9, 150000);
            Veler veler4 = new Veler(1, 3, 2, "Valiant", "Nemo", 8, 10, 9, 120000);
            Veler veler5 = new Veler(1, 3, 2, "Galeon", "Galeon", 25, 10, 9, 5000);

            emp.afegirModel(veler1);
            emp.afegirModel(veler2);
            emp.afegirModel(veler3);
            emp.afegirModel(veler4);
            emp.afegirModel(veler5);

            Motora motora1 = new Motora(200, 50, true, "Sunseeker", "Scennic", 10, 5, 2.5, 50000);
            Motora motora2 = new Motora(200, 50, true, "Fairline", "Focus", 10, 5, 2.5, 45000);
            Motora motora3 = new Motora(200, 50, true, "Quicsilver", "wuick", 10, 5, 2.5, 150000);
            Motora motora4 = new Motora(200, 50, true, "Sunseeker", "Scennic", 10, 5, 2.5, 50000);
            Motora motora5 = new Motora(200, 50, true, "Sunseeker", "Scennic", 10, 5, 2.5, 50000);

            emp.afegirModel(motora1);
            emp.afegirModel(motora2);
            emp.afegirModel(motora3);
            emp.afegirModel(motora4);
            emp.afegirModel(motora5);

            Client cli = new Client("Maria", "Fiol", "22555666B", Document.DNI, "", 620154010, "C/Margalida nº2", "ES0020368749");
            Client cli2 = new Client("Boat", "Inc", "11555666B", Document.DNI, "", 620154010, "C/Margalida nº2", "ES0020368743");
            Client cli3 = new Client("Joana", "Llompart", "33555666B", Document.DNI, "", 620154010, "C/Margalida nº2", "ES0020368744");
            Client cli4 = new Client("Rosa", "rossa", "44555666B", Document.DNI, "", 620154010, "C/Margalida nº2", "ES0020368747");
            Client cli5 = new Client("Marian", "Munar", "55555666B", Document.DNI, "", 620154010, "C/Margalida nº2", "ES0020368759");

            emp.afegirClient(cli);
            emp.afegirClient(cli2);
            emp.afegirClient(cli3);
            emp.afegirClient(cli4);
            emp.afegirClient(cli5);

            Vaixell embar = new Vaixell("6ª-TA-2-010-12", false, cli, veler1);
            Vaixell embar2 = new Vaixell("7ª-TA-2-011-12", true, cli2, veler1);
            Vaixell embar3 = new Vaixell("8ª-TA-2-012-10", true, cli2, iot1);
            Vaixell embar4 = new Vaixell("9ª-TA-2-013-16", true, cli2, motora1);
            Vaixell embar5 = new Vaixell("16ª-TA-2-010-12", false, cli4, iot5);

            emp.afegirVaixell(embar);
            emp.afegirVaixell(embar2);
            emp.afegirVaixell(embar3);
            emp.afegirVaixell(embar4);
            emp.afegirVaixell(embar5);

            String dataInici = "25-05-2016";
            Date dataIni = sdf.parse(dataInici);
            String dataFinal = "10-06-2016";
            Date dataFi = sdf.parse(dataFinal);
            Reparacio rep = new Reparacio(cli, embar, "drassanes", dataIni, "Forat a sa quilla", 10000,  Estat.PENDENT);
            String dataInici2 = "2-05-2016";
            Date dataIni2 = sdf.parse(dataInici);
            Reparacio rep2 = new Reparacio(cli2, embar2, "Taller BoatInc", dataIni, "Llija, pintar y pulir", 700,  Estat.ATURAT);
             String dataInici3 = "22-05-2016";
            Date dataIni3 = sdf.parse(dataInici);
            Reparacio rep3 = new Reparacio(cli2, embar3, "Taller BoatInc", dataIni, "Motor", 10000,  Estat.PENDENT);
            Reparacio rep4 = new Reparacio(cli, embar, "Aigua", dataIni, "Reparació vela", 10000,  Estat.PENDENT);
            Reparacio rep5 = new Reparacio(cli, embar5, "Aigua", dataIni, "Canvi sistema GPS", 600,  Estat.ATURAT);
            
             emp.afegirReparacio(rep);
             emp.afegirReparacio(rep2);
             emp.afegirReparacio(rep3);
             emp.afegirReparacio(rep4);
             emp.afegirReparacio(rep5);
            
            
            
        } catch (EmpleatException ex) {
            System.out.println(ex.getMessage());
        }

        return emp;
    }

    public void llegeixFitxer(String desti) throws IOException {
        EinesObjectStream.llegeixObjecte(desti);
    }

    public void guardarFitxer(String desti) throws IOException {
        EinesObjectStream.escriuObjecte(desti, this);
    }

    public void provesEmpresa(Empresa emp) throws LlistesException {
        System.out.println("MODELS PER INTERVAL DE PREU");
        System.out.println(emp.modelsPreu(10000, 100000));
        System.out.println("REPARACIONS ATURADES");
        System.out.println(emp.llistaReparacionsAturades());
        System.out.println("REPARACIONS PENDENTS");
        System.out.println(emp.llistaReparacionsPendets());
    }

    public static void main(String[] args) throws ParseException, PersonaException, EmpleatException, EmpresaException, LlistesException, ReparacioException {
        String desti = "C:\\Users\\Elio\\Desktop\\Elio Classe\\Programació\\objecte.Desti";
        Main main = new Main();
        Empresa boat = main.inici();
        main.provesEmpresa(boat);
    }

}
