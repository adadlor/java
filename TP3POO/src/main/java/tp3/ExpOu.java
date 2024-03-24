/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author magasin
 */
public class ExpOu extends ExpBinaire{

    public ExpOu(ExpBooleenne fg, ExpBooleenne fd) {
        super(fg, fd);
    }

    @Override
    public String toString() {
        return super.toString() + this.fg + " ou " + this.fd + ")";
    }
    
    
}
