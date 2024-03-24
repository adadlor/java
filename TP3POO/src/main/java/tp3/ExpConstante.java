/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package tp3;
import java.util.HashMap;
/**
 *
 * @author magasin
 */
public class ExpConstante extends ExpBooleenne{
    private boolean v;

    public final static ExpConstante VRAI = new ExpConstante(true);
    public final static ExpConstante FAUX = new ExpConstante(false);

    public ExpConstante(boolean v) {
        this.v = v;
    }

    @Override
    public String toString() {
        if (v){
            return "vrai";
        }else{
            return "faux";
        }
    }


    @Override
    public boolean evaluate(HashMap<VarBool, Boolean> contexte) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
