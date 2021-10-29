package day05;

public class JournalMain {
    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println(journal.addStudent("Kis Pista"));
        System.out.println(journal.addStudent("Madonna"));
        System.out.println(journal.getChildren());
    }
}
