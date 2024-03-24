/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magasin;

/**
 *
 * @author valentinwendling
 */
public class Bricolage extends Articles{
    private String rayon;
    private String electrique;
    
    public Bricolage(String nom, String id, int prix, int stock, String rayon, String electrique) {
        this.nom = nom;
        this.id = id;
        this.prix = prix;
        this.stock = stock;
        this.rayon = rayon;
        this.electrique = electrique;
    }

    public String getRayon() {
        return rayon;
    }

    public Boolean isElectrique() {
        if (electrique.equals("Nonelectrique")){
            return false;
        }else{
            return true;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }

    public int getPrix() {
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public void setElectrique(String electrique) {
        this.electrique = electrique;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
     
    
}

