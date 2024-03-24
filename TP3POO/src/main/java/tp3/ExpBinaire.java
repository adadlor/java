/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;
import java.util.HashMap;


public class ExpBinaire extends ExpBooleenne{
    protected ExpBooleenne fg;
    protected ExpBooleenne fd;
    
    public ExpBinaire(ExpBooleenne fg, ExpBooleenne fd) {
        this.fg = fg;
        this.fd = fd;
    }

    @Override
    public String toString() {
        return "(";
    }


    @Override
    public boolean evaluate(HashMap<VarBool, Boolean> contexte) {
        return false;
    }
}
