/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainToni;

import com.BoatToni.Empresa.Empresa;
import com.BoatToni.Exceptions.EmpleatException;
import com.BoatToni.Exceptions.EmpresaException;
import com.BoatToni.Exceptions.PersonaException;
import com.BoatToni.Persona.Comercial;
import com.BoatToni.Persona.Document;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class provesToni {

    Empresa main;
    
    public void inicialitzar() throws ParseException, PersonaException, EmpleatException, EmpresaException{
        main = new Empresa();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        
        try{
            Date dataAlta = sdf.parse("12-04-2016");
            Date dataInici = sdf.parse("16-12-2015");
            Date dataFi = sdf.parse("17-12-2015");
            Date dataIniciReparacio = sdf.parse("05-05-2015");
            Date dataVenda = sdf.parse("22-08-2015");
            
            Comercial com1 = new Comercial("Toni", "Dalmau Martinez", "46589233H", Document.DNI,"toni@todalmar.com", 96385204, "c/picasso nº1", dataAlta, 1200, 10);
            main.afegirComercial(com1);
            main.getLlistaComercial();
        }catch (ParseException ex) {
            System.out.println("Format fecha incorrecte.");
            ex.printStackTrace();
        }catch (PersonaException ex) {
            System.out.println("Dades de persona incorrectes.");
        }catch (EmpleatException ex) {
            System.out.println("Dades de l'empeat incorrectes.");
        }catch (EmpresaException ex) {
            System.out.println("Dades de l'empresa incorrectes.");
        }
    }
    
    public static void main(String[] args) throws ParseException, PersonaException, EmpleatException, EmpresaException {
        provesToni pt = new provesToni();
        pt.inicialitzar();
    }
    
}
