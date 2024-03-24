/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magasin;

/**
 *
 * @author valentinwendling
 */
public class Animal extends Articles{
    private String canimal;
    private int masse;
    
    public Animal(String nom, String id, int prix, int stock, String canimal, int masse) {
        this.nom = nom;
        this.id = id;
        this.prix = prix;
        this.stock = stock;
        this.canimal = canimal;
        this.masse = masse;
    }

    public String getCanimal() {
        return canimal;
    }

    public int getMasse() {
        return masse;
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

    public void setRayon(String canimal) {
        this.canimal = canimal;
    }

    public void setMasse(int masse) {
        this.masse = masse;
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
