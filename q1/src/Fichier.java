import java.util.ArrayList;

public class Fichier extends Noeud {
    private int taille;

    public  Fichier(String nom){
        super(nom);
        this.taille = 0;
    }

    public Fichier(String nom, int taille){
        super(nom);
        this.taille = taille;
    }

    public int donneTaille(){
        return this.taille;
    }
    @Override
    public String donneNom() {
        return this.nom;
    }

    @Override
    public boolean ajouteElt(Noeud nouveau) {
        throw new UnsupportedOperationException("UnsupportedOperationExeption");
    }

    @Override
    public boolean supprimeElt(Noeud existants) {
        throw new UnsupportedOperationException("UnsupportedOperationExeption");
    }

    @Override
    public ArrayList<Noeud> donneElementsFils() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Noeud> rechercheElt(String nom){
        ArrayList<Noeud> liste = new ArrayList<Noeud>();
        if (this.donneNom().equals(nom)){
            liste.add(this);
        }
        return liste;
    }
}
