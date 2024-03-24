import java.util.ArrayList;

public abstract class Noeud {
    protected String nom;
    protected Noeud parent;

    public Noeud(String nom){
        this.nom = nom;
        this.parent = null;

    }
    public void setParent(Noeud p){
        this.parent = p;
    }

    public Noeud donneParent(){
        return this.parent;
    }
    public abstract int donneTaille();
    public abstract String donneNom();
    public abstract boolean ajouteElt(Noeud nouveau);
    public abstract boolean supprimeElt(Noeud existants);
    public abstract ArrayList<Noeud> donneElementsFils();

    public abstract ArrayList<Noeud> rechercheElt(String nom);
}
