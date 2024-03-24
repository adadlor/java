public class Employee {
    private String prenom;
    private String nom;
    private int age;
    private String poste;

    public Employee(String prenom, String nom, int age, String poste) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.poste = poste;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getPoste() {
        return poste;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", poste='" + poste + '\'' +
                '}';
    }

    public String getInitiales() {
        return String.valueOf(nom.charAt(0)) + String.valueOf(prenom.charAt(0));
    }
}
