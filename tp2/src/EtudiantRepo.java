import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EtudiantRepo {
    private List<Etudiant> promotions;

    public EtudiantRepo() {
        this.promotions = new ArrayList<Etudiant>();
    }
    // Add a student to the specified promotion or create a new one if it doesn't exist yet.
    public void ajouterEtudiant(Etudiant etudiant) {
        this.promotions.add(etudiant);
    }

    public List<Etudiant> getPromotions(){return this.promotions;}

    public List<Etudiant> studentsOlderThanTwenty() {
        return this.promotions.stream().filter(student -> student.getAge() > 20).collect(Collectors.toList());}

    public void afficherListeEtudiantsTrieeParNoms() {
        this.promotions.stream()
                .sorted((student1, student2) -> student1.getPrenom().compareTo(student2.getPrenom()))
                .sorted((student1, student2) -> student1.getNom().compareTo(student2.getNom()))
                .forEach(etudiant -> System.out.println(etudiant));
    }

    public List<Double> getMoyenne() {
        return this.promotions.stream()
                .map(student -> student.getMoyenne())
                .collect(Collectors.toList());
    }

    public List<Etudiant> etudiantAdmis() {
        return this.promotions.stream().filter(student -> student.getMoyenne() >= 10).collect(Collectors.toList());
    }

    public List<Etudiant> etudiantAjpournee() {
        return this.promotions.stream().filter(student -> student.getMoyenne() < 10).collect(Collectors.toList());
    }

    public void repartitionAge(int age) {
        this.promotions.stream().filter(student -> student.getAge() == age).forEach(e -> System.out.println(e));
    }

    public Map<String, List<String>> listeDesNomsParGenre() {
        return this.promotions.stream()
                .collect(Collectors.groupingBy(
                        Etudiant::getGenre,
                        Collectors.mapping(Etudiant::nomComplet, Collectors.toList())));
    }

    public double getMoyennePromo() {
        return this.promotions.stream()
                .mapToDouble(i -> i.getMoyenne()/ this.promotions.size())
                .reduce(0d, Double::sum);
    }

    public int etudiantAdmisNumber() {
        return this.etudiantAdmis().size();
    }

    public Optional<Etudiant> major(){
        return this.promotions.stream()
                .max(Comparator.comparingDouble(Etudiant::getMoyenne));
    }

    public List<Etudiant> les10Premier(){
        return this.promotions.stream()
                .sorted(Comparator.comparing(Etudiant::getMoyenne).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    public OptionalDouble moyennePlusFrequente() {
        Map<Double, Long> occurrences = promotions.stream()
                .mapToDouble(Etudiant::getMoyenne)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Optional<Map.Entry<Double, Long>> maxEntry = occurrences.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return maxEntry.map(entry -> entry.getKey()).map(OptionalDouble::of).orElseGet(OptionalDouble::empty);
    }

    public Map<String, List<Etudiant>> etudiantsMeilleuresNotesParModule() {
        return promotions.stream()
                .flatMap(etudiant -> etudiant.getNotes().stream())
                .filter(note -> note.getNote() > 15)
                .collect(Collectors.groupingBy(Note::getModule, Collectors.mapping(Etudiant::new, Collectors.toList())));
    }

    public Map<Etudiant, List<String>> modulesARepasserParEtudiant() {
        return promotions.stream()
                .collect(Collectors.toMap(
                        etudiant -> etudiant,
                        etudiant -> etudiant.getNotes().stream()
                                .filter(note -> note.getNote() < 10)
                                .map(Note::getModule)
                                .collect(Collectors.toList())
                ));
    }

    public void afficherNomsPrenomsEtNotes() {
        promotions.forEach(etudiant -> {
            System.out.print(etudiant.getNom() + " " + etudiant.getPrenom() + " (");
            etudiant.getNotes().forEach(note -> System.out.print(note.getNote() + " "));
            System.out.println(")");
        });
    }



}
