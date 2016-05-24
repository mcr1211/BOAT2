/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatInc.Main;

import com.BoatToni.Empresa.Empresa;
import com.BoatToni.Exceptions.EmpleatException;
import com.BoatToni.Exceptions.LlistesException;
import com.BoatToni.Exceptions.PersonaException;
import com.BoatToni.Persona.Comercial;
import com.BoatToni.Persona.Document;
import com.BoatToni.Persona.Habilitat;
import com.BoatToni.Persona.Taller;
import com.BoatToni.Vaixell.Iot;
import com.BoatToni.Vaixell.Motora;
import com.BoatToni.Vaixell.Veler;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Elio
 */
public class Main {

    public static void inici() throws ParseException, PersonaException, EmpleatException {
        Empresa emp = new Empresa("BoatsInc");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            String data = "1-05-2016";
            Date d1 = sdf.parse(data);
            String data1 = "2-05-2016";
            Date d2 = sdf.parse(data1);
            String data2 = "3-05-2016";
            Date d3 = sdf.parse(data2);
            String data3 = "4-05-2016";
            Date d4 = sdf.parse(data3);
            String data4 = "5-05-2016";
            Date d5 = sdf.parse(data4);

            //**EMPLEATS COMERCIALS
            Comercial venedor = new Comercial("Pau", "Ramis", "43111555K", Document.DNI, "pramis@gmail.com", 666999888, "C/Sol nº1", d2, 1200, 10);
            Comercial venedor2 = new Comercial("Barbara", "Thomas", "42222222K", Document.DNI, "lamasguaoa@gmail.com", 666199888, "C/Sol nº2", d2, 1200, 10);
            Comercial venedor3 = new Comercial("María", "Bennàssar", "43121555K", Document.DNI, "bennassar@gmail.com", 767979787, "C/Sol nº3", d2, 1200, 10);
            Comercial venedor4 = new Comercial("Pep", "Fiol", "66111555K", Document.DNI, "pep87@gmail.com", 666999828, "C/Lluna nº1", d2, 1200, 10);
            Comercial venedor5 = new Comercial("Tomeu", "Terrassa", "43111555K", Document.DNI, "tomeut@gmail.com", 676999448, "C/Major nº4", d2, 1200, 10);

            emp.afegirComercial(venedor);
            emp.afegirComercial(venedor2);
            emp.afegirComercial(venedor3);
            emp.afegirComercial(venedor4);
            emp.afegirComercial(venedor5);

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
            Iot iot1 = new Iot("H2 Yacht Design","Mars",80,30,15,1600000,25,3000,90,true);
            Iot iot2 = new Iot("Isa yachts","Yara",46.73,8.85,2.16,60000000,10,1500,50,true);
            Iot iot3 = new Iot("HDW","Al Salamah",80,30,15,20000,25,3000,190,true);
            Iot iot4 = new Iot("Blohm & Voss","A",80,30,15,323000000,25,3000,90,true);
            Iot iot5 = new Iot("Blohm & Voss","Serene",80,30,15,33000000,25,3000,90,true);
            
            emp.afegirModel(iot1);
            emp.afegirModel(iot2);
            emp.afegirModel(iot3);
            emp.afegirModel(iot4);
            emp.afegirModel(iot5);
           
            Veler veler1 = new Veler(1,3,2,"Jeanneau","La pinta",20,10,9,2000);
            Veler veler2 = new Veler(1,3,2,"Bénéteau","Mar",12,10,9,200000);
            Veler veler3 = new Veler(1,3,2,"Sea Ray","Neptuno",10,10,9,150000);
            Veler veler4 = new Veler(1,3,2,"Valiant","Nemo",8,10,9,120000);
            Veler veler5 = new Veler(1,3,2,"Galeon","Galeon",25,10,9,5000);
            
            emp.afegirModel(veler1);
            emp.afegirModel(veler2);
            emp.afegirModel(veler3);
            emp.afegirModel(veler4);
            emp.afegirModel(veler5);
            
            Motora motora1 = new Motora(200,50,true,"Sunseeker","Scennic",10,5,2.5,50000);
            Motora motora2 = new Motora(200,50,true,"Fairline","Focus",10,5,2.5,45000);
            Motora motora3 = new Motora(200,50,true,"Quicsilver","wuick",10,5,2.5,150000);
            Motora motora4 = new Motora(200,50,true,"Sunseeker","Scennic",10,5,2.5,50000);
            Motora motora5 = new Motora(200,50,true,"Sunseeker","Scennic",10,5,2.5,50000);
            
            emp.afegirModel(motora1);
            emp.afegirModel(motora2);
            emp.afegirModel(motora3);
            emp.afegirModel(motora4);
            emp.afegirModel(motora5);
            
            
            
            
        } catch (EmpleatException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void provesEmpresa(Empresa emp) throws LlistesException {
        System.out.println("MODELS PER INTERVAL DE PREU");
        System.out.println(emp.modelsPreu(10000, 100000));
        System.out.println("REPARACIONS ATURADES");
        System.out.println(emp.llistaReparacionsAturades());
        System.out.println("REPARACIONS PENDENTS");
        System.out.println(emp.llistaReparacionsPendets());
    }
    
    public void main (String[] args) throws ParseException, PersonaException, EmpleatException{
        Main.inici();
    }

}
