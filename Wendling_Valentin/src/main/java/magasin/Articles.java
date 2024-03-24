/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valentinwendling
 */

package magasin;

public abstract class Articles {
    protected String nom;
    protected String id;
    protected int prix;
    protected int stock;
    
    public abstract String getNom();
    public abstract String getId();
    public abstract int getPrix();
    public abstract int getStock();
    
    public abstract void setNom(String n);
    public abstract void setId(String i);
    public abstract void setPrix(int p);
    public abstract void setStock(int n);
    
}

