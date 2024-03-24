import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;


public class EmployeeRepo {
    private ArrayList<Employee> liste = new ArrayList<Employee>();

    public void ajouterEmployee(Employee employee) {
        liste.add(employee);
    }

    public void afficher(){
        for (Employee c: this.liste) {
            System.out.println(c.getNom() + " " +c.getPrenom() + " a " + c.getAge() + " et occupe le poste " + c.getPoste());
        }
    }

    public void afficher2(Consumer<Employee> consumer) {
        liste.forEach(consumer);
    }
    public void afficherInitiales(Consumer<String> consumer) {
        liste.forEach(employee -> consumer.accept(employee.getInitiales()));
    }

    public EmployeeRepo(ArrayList<Employee> liste) {
        this.liste = liste;
    }

    public EmployeeRepo() {
    }
    public ArrayList<Employee> getListe() {
        return liste;
    }

    public void setListe(ArrayList<Employee> liste) {
        this.liste = liste;
    }

    public void empFilAge() {
        liste.removeIf(employee -> employee.getAge() > 60);
    }

    public void empSansPoste() {
        liste.removeIf(employee -> employee.getPoste() == null || employee.getPoste().isEmpty());
    }

    public void empTri() {
        Collections.sort(liste, Comparator
                .comparing(Employee::getNom)
                .thenComparing(Employee::getPrenom)
                .thenComparing(Employee::getAge));
    }

    public void empTri2() {
        employees.sort(Comparator
                .comparing(Employee::getNom)
                .thenComparing(Employee::getPrenom)
                .thenComparing(Employee::getAge));
    }

    public static void main(String[] args) {
        EmployeeRepo employeeRepo = new EmployeeRepo();

        // Ajouter des employés à la liste
        employeeRepo.ajouterEmployee(new Employee("Doe", "John", 30, "Développeur"));
        employeeRepo.ajouterEmployee(new Employee("Smith", "Jane", 25, "Designer"));
        employeeRepo.ajouterEmployee(new Employee("Billy", "Harry", 67, "Développeur"));
        employeeRepo.ajouterEmployee(new Employee("Simpson", "Marge", 25, ""));

        // Afficher les employés en utilisant un Consumer avec forEach
        Consumer<Employee> afficherEmployee = c -> System.out.println(c.getNom() + " " +c.getPrenom() + " a " + c.getAge() + " et occupe le poste " + c.getPoste());
        employeeRepo.afficher2(afficherEmployee);

        Consumer<String> afficherInitiales = initiales -> System.out.println("Initiales : " + initiales);
        employeeRepo.afficherInitiales(afficherInitiales);

        employeeRepo.empFilAge();

        employeeRepo.afficher2(afficherEmployee);

        employeeRepo.afficherInitiales(afficherInitiales);

        employeeRepo.empSansPoste();

        employeeRepo.afficher2(afficherEmployee);

        employeeRepo.afficherInitiales(afficherInitiales);

        employeeRepo.empTri();

        // Afficher les employés après le tri
        System.out.println("\nAprès le tri :");
        employeeRepo.afficher2(afficherEmployee);
    }
}
