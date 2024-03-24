import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valentinwendling
 */
public class App {
    public static void main(String[] args) {
        System.out.println("NUUTNUUUT");
        ListeCons liste1 = new ListeCons(1,new ListeCons(2, 
                        new ListeCons(3, new ListeVide())));
        ListeCons liste2 = new ListeCons(4,new ListeCons(4, 
                        new ListeCons(6, new ListeVide())));
        ListeCons liste3 = new ListeCons(2,new ListeCons(3, 
                        new ListeCons(6, new ListeVide())));
        
        ListeCons listeAlea = new ListeCons(5);
        
        listeAlea.afficher();
        System.out.println("NUUTNUUUT");
        listeAlea.QS().afficher();
        System.out.println("NUUTNUUUT");
        ArrayList T = new ArrayList();
        listeAlea.listeEnTab(T);
        System.out.println(T);
        QStore Q = new QStore();
        Q.exec();
    }
}
