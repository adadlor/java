/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.util.HashMap;

/**
 *
 * @author magasin
 */
public class ExpNegation extends ExpBooleenne {
    private ExpBooleenne fils;

    public ExpNegation(ExpBooleenne fils) {
        
        this.fils = fils;
    }
    
    @Override
    public String toString() {
        return " non " + this.fils + "";
    }

    @Override
    public boolean evaluate(HashMap<VarBool, Boolean> contexte) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
