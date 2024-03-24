/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magasin;

/**
 *
 * @author valentinwendling
 */
public class Jardinage extends Articles{
    private String saison;

    public Jardinage(String nom, String id, int prix, int stock, String saison) {
        this.nom = nom;
        this.id = id;
        this.prix = prix;
        this.stock = stock;
        this.saison = saison;
    }

    public String getSaison() {
        return saison;
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

    public void setSaison(String saison) {
        this.saison = saison;
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

