/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conteneur;

/**
 *
 * @author valentinwendling
 */
public class ConteneurUrgent extends Conteneur{
    private int poidsMax;

    public ConteneurUrgent(int poidsMax, int distance, int volumeMax) {
        super(distance, volumeMax);
        this.poidsMax = poidsMax;
    }
    
    public boolean ajout(Colis c){
        if (this.conditionChargement(c) && c.donnePoids() < poidsMax){
            this.getlColis().add(c);
            this.setVolumeMax(this.getVolumeMax() - c.donneVolume());
            this.poidsMax -= c.donnePoids();
            return true;
        } else{
            return false;
        }  
    }
    
    public int cout(){
        return super.cout() * 2;
    }
    
}
