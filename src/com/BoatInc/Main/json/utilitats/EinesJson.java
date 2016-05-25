/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatInc.Main.json.utilitats;

import com.BoatInc.Main.json.interficies.ConvertibleJson;

/**
 *
 * @author Elio
 */
public class EinesJson implements ConvertibleJson{

    public void rebreparametre(ConvertibleJson obj) {
        System.out.println(obj.getJson());
    }

    @Override
    public String getJson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
