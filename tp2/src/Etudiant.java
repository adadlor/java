import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {
    private int numero;
    private String nom;
    private String prenom;
    private int age;
    private String genre;
    private ArrayList<Note> notes = new ArrayList<Note>();

    public Etudiant(int numero, String nom, String prenom, int age, String genre, ArrayList<Note> note) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.genre = genre;
        this.notes =  note;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public double getMoyenne() {
        return this.notes.stream()
                .mapToDouble(i -> i.getNote()/ this.notes.size())
                .reduce(0d, Double::sum);
    }

    public String getGenre() {
        return genre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public String nomComplet() {return this.nom + " " + this.prenom;}
}

