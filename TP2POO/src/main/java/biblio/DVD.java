package biblio;

/**
 * La classe DVD represente un objet DVD. L'information sur le 
 * DVD est stockee et peut etre accedee. Nous considerons ici
 * uniquement les DVD Video.
 * 
 */
public class DVD extends EltMM
{
    
    private String realisateur;
    

    /**
     * Initialise un DVD.
     * 
     * @param unTitre Le titre du DVD.
     * @param unRealisateur
     * @param unArtiste Le nom de l'artiste du DVD.
     * @param uneDuree La duree du DVD.
     */
    public DVD(String unTitre,String unRealisateur, int uneDuree)    
    {
        super(unTitre, uneDuree);
        this.realisateur = unRealisateur;
        
    }

    

    /**
     * Donne le nom du realisateur
     *
     * @return le nom du realisateur
     */
    public String donneRealisateur()
    {
        return this.realisateur;
    }

    
    @Override
    public String donneType(){
        return "DVD";
    }
    




    /**
     * Renvoie une description textuelle de l'objet
     *
     * @return un chaine de caracteres decrivant l'objet
     */
    
    @Override
    public String toString()
    {
        
        return super.toString() +  "Realisateur : " + this.realisateur + "\n";
    }
}
