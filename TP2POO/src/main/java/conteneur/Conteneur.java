/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conteneur;

import java.util.ArrayList;

/**
 *
 * @author valentinwendling
 */
public class Conteneur {
    private int distance;
    private int volumeMax;
    private ArrayList<Colis> lColis = new ArrayList<Colis>();
    
    public Conteneur(int distance, int volumeMax){
        this.distance = distance;
        this.volumeMax = volumeMax;
    }
    
    public boolean ajout(Colis c){
        if (this.conditionChargement(c)){
            this.lColis.add(c);
            this.volumeMax -= c.donneVolume();
            return true;
        } else{
            return false;
        }  
    }
    
    public boolean conditionChargement(Colis c){
        if (volumeMax >= c.donneVolume() && this.distance == c.donneDistance()){
            return true;
        } else{
            return false;
        }  
    }
    
    public int cout(){
        return this.distance * this.donnePoids();
    }
    
    public int donneDistance(){
        return this.distance;
    }
    
    public int donnePoids(){
        int cache = 0;
        for (Colis c : this.lColis){
            cache += c.donnePoids();
        }
        return cache;
    }

    @Override
    public String toString() {
        return "Conteneur{" + "distance=" + distance + ", volumeMax=" + volumeMax + ", lColis=" + lColis + '}';
    }

    public int getDistance() {
        return distance;
    }

    public int getVolumeMax() {
        return volumeMax;
    }
    
    public ArrayList<Colis> getlColis() {
        return lColis;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public void setlColis(ArrayList<Colis> lColis) {
        this.lColis = lColis;
    }
}
