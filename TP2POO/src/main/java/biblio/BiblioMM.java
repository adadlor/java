package biblio;

import java.util.ArrayList;

/**
 * La classe BiblioMM fournit un moyen de stocker des objets
 * CD et DVD. Une liste de tous les CD et DVD peut etre affichee
 * en mode texte.
 * 
 */
public class BiblioMM
{
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;
    private ArrayList<EltMM> elts;

    /**
     * Construit une bibliotheque vide.
     */
    public BiblioMM(){
        this.elts = new ArrayList<>();
    }

    /**
     * Ajoute un elt a la bibliotheque.
     */
    public void ajouter(EltMM elt){
        this.elts.add(elt);
    }

    public ArrayList<EltMM> rechercherTitre(String titre){
        ArrayList<EltMM> elt = new ArrayList<>();
        
        for (EltMM e : this.elts){
            if (e.donneTitre().equals(titre))
                elt.add(e);
        }
        
        return elt;
        
    }
    
    public EltMM emprunterTitre(String titre){
        ArrayList<EltMM> elt = this.rechercherTitre(titre);
        
        if (!elt.isEmpty()){
            this.elts.remove(elt.get(0));
            elt.get(0).emprunter();
            return elt.get(0);
        }else{
            return null;
        }  
    }
    
    public boolean rendreTitre(EltMM elt){
        if (this.rechercherTitre(elt.donneTitre()).isEmpty()){
            this.elts.add(elt);
            elt.restituer();
            return true;
        }else{
            return false;   
        }
    }
    /**
     * Affiche une liste de tous les CD et DVD actuellement dans
     * la bibliotheque.
     */
    public void affiche()
    {
        for(EltMM elt : this.elts) {
            System.out.println(elt.toString());   
        }

    }
}
