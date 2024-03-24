package magasin;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valentinwendling
 */
public class Catalogue {
    private ArrayList<Articles> array;

    public Catalogue(ArrayList<Articles> catalogue) {
        this.array = catalogue;
    }
    
    public Catalogue() {
        this.array = new ArrayList();
    }

    public ArrayList<Articles> getCatalogue() {
        return array;
    }

    public void setCatalogue(ArrayList<Articles> catalogue) {
        this.array = catalogue;
    }
    public void addProd(Articles a){
        this.array.add(a);
    }
}
