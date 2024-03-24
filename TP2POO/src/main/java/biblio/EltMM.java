/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author magasin
 */
public class EltMM {
    private String unTitre;
    private int uneDuree;
    private String commentaire;
    private Boolean presentEnRayon;

    public EltMM(String unTitre, int uneDuree) {
        this.unTitre = unTitre;
        this.uneDuree = uneDuree;
        this.commentaire = "<pas de commentaires>";
        this.presentEnRayon = true;
    }
    
    public String donneTitre(){
        return this.unTitre;
    }
    
    public int donneDuree(){
        return this.uneDuree;
    }
    
    public void ajouteCommentaires(String commentaires){
        this.commentaire = commentaire;            
    }
    
    public String donneCommentaires(){
        return this.commentaire;
    }
    
    public void changeEtatEmprunt(boolean etat){
        this.presentEnRayon = etat;
    }
    
    public boolean donneEtatEmprunt(){
        return this.presentEnRayon;
    }
    
    public boolean emprunter(){
        this.presentEnRayon = false;
        
        return this.presentEnRayon;
    }
    
    public boolean restituer(){
        this.presentEnRayon = true;
        
        return this.presentEnRayon;
    }
    
    public String donneType(){
        return "";
    }
    
    
  
    @Override
    public String toString(){
        
        String s = "\n"+ this.donneType() +" :\n";
        s += "Titre : " + this.unTitre + "\n";
        s += "Duree : " + this.uneDuree + "\n";
        s += "Etat : ";
        if (this.presentEnRayon)
        {
            s += "disponible\n";
        }
        else
        {
            s += "emprunte\n";
        }
        s += "Commentaires : " + this.commentaire + "\n";
        
        
        //s += "Realisateur : " + this.realisateur + "\n";
        
        return s;
    }
    
    
}
