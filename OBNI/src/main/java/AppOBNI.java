/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valentinwendling
 */
public class AppOBNI {
    public static void main(String[] args) {
        ObjetBougeant crevette = new ObjetBougeant();
        ObjetBougeant calamar = new ObjetBougeant();
        
        crevette.setNom("CREVETTE");
        crevette.setX(12);
        crevette.setY(15);
        crevette.setR(0.4);
        
        calamar.setNom("CALAMAR");
        calamar.setX(24);
        calamar.setY(18);
        calamar.setR(1.2);
        
        System.out.println(crevette);
        System.out.println(calamar);
    }
    
}
