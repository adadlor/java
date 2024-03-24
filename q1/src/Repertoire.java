import java.util.ArrayList;

public class Repertoire extends Noeud{

    private ArrayList<Noeud> list;

    public Repertoire(String nom){
        super(nom);
        this.list = new ArrayList<Noeud>();
    }

    @Override
    public int donneTaille() {
        int cache = 0;
        for (Noeud n : list){
            cache += n.donneTaille();
        }
        return cache;
    }

    @Override
    public String donneNom() {
        return this.nom;
    }

    @Override
    public boolean ajouteElt(Noeud nouveau) {
        if (nouveau.equals(this)){
            return false;
        }
        for (Noeud n : list){
            if (nouveau.donneNom().equals(n.donneNom()) && nouveau.equals(n)){
                return false;
            }
        }
        this.list.add(nouveau);
        nouveau.setParent(this);
        return true;
    }

    @Override
    public boolean supprimeElt(Noeud existants) {
        for (Noeud n : list){
            if (existants.donneNom().equals(n.donneNom())){
                list.remove(n);
                w
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Noeud> donneElementsFils() {
        ArrayList<Noeud>liste = new ArrayList<Noeud>();
        for (Noeud n : list){
            liste.add(n);
        }
        return liste;
    }

    @Override
    public ArrayList<Noeud> rechercheElt(String nom) {
        ArrayList<Noeud> liste = new ArrayList<Noeud>();
        if (this.donneNom().equals(nom)){
            liste.add(this);
        }
        for (Noeud n : this.list){
            n.rechercheElt(nom);
        }

        return liste;
    }
}
