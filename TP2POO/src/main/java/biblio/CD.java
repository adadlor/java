package biblio;

/**
 * La classe CD represente un objet CD. 
 * 
 */
public class CD extends EltMM{
    
    private String artiste;
    private int nbPistes;
    

    /**
     * Initialise un CD.
     * 
     * @param unTitre Le titre du CD.
     * @param unArtiste Le nom de l'artiste du CD.
     * @param pistes Le nombre de pistes du CD.
     * @param uneDuree La duree du CD.
     */
    public CD(String unTitre, String unArtiste, int pistes, int uneDuree){
        super(unTitre, uneDuree);
        this.artiste = unArtiste;
        this.nbPistes = pistes;
    }

    /**
     * Donne le nom de l'artiste
     * 
     * @return nom de l'artiste
     */
    public String donneArtiste(){
        return this.artiste;
    }

    /**
     * Donne le nombre de pistes du CD.
     * 
     * @return nombre de pistes
     */
    public int donneNbPistes()
    {
        return this.nbPistes;
    }
    
    @Override
    public String donneType(){
        return "CD";
    }
   

    /**
     * Renvoie une description textuelle de l'objet
     *
     * @return un chaine de caracteres decrivant l'objet
     */
    @Override
    public String toString()
    {
        
        return super.toString() + "Artiste : " + this.artiste + "\npistes : " + this.nbPistes;
    }
}
