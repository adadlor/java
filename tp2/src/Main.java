import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Note> note1 = new ArrayList<Note>();
        note1.add(new Note("fr", 10));
        note1.add(new Note("fr", 12));
        note1.add(new Note("fr", 8));
        note1.add(new Note("fr", 10));
        Etudiant Albert = new Etudiant(1, "reporter", "albert", 12, "helicoptère", note1);
        System.out.println("Hello world!");
        System.out.println(Albert.getMoyenne());

    }

}