/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.BoatToni.Empresa.Empresa;
import com.BoatToni.Exceptions.EmpresaException;
import com.BoatToni.Exceptions.PersonaException;
import com.BoatToni.Persona.Client;
import com.BoatToni.Persona.Document;
import com.BoatToni.TargetaCredit.TargetaCredit;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elio
 */
public class ProvesLlistaClient {
    
   
    
    @Test
    public void afegirClient() throws PersonaException, EmpresaException{
        Empresa test = new Empresa("Test");
  
        Client cli = new Client("Test","Test","11111199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
        Client cli2 = new Client("Test","Test","11111199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
        Client cli3 = new Client("Test","Test","11113199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
        test.afegirClient(cli);
        test.afegirClient(cli3);
        
        assertEquals("Ha anat bé",2,test.getLlistaClient().size());
        
    }
    
    
    
    @Test(expected = EmpresaException.class)
    public void afegirClientException() throws PersonaException, EmpresaException{
    Empresa test = new Empresa("Test");
  
    Client cli = new Client("Test","Test","11111199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
    Client cli2 = new Client("Test","Test","11111199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
    Client cli3 = new Client("Test","Test","11113199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
    
    test.afegirClient(cli);
    test.afegirClient(cli2);
}
    
    
    @Test
    public void eliminarClient() throws PersonaException, EmpresaException{
       Empresa test = new Empresa("Test");
  
    Client cli = new Client("Test","Test","11111199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
    Client cli2 = new Client("Test","Test","11111199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
    Client cli3 = new Client("Test","Test","11113199J",Document.DNI,"test@test.com",666223311,"C/test nº1","ES00223366");
    
    test.afegirClient(cli3);
    test.afegirClient(cli);
    test.eliminarClient("11111199J");
    
    
    assertEquals("ha anat bé",1,test.getLlistaClient().size());
    }
    
}
