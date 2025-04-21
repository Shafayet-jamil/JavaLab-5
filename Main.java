import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("OOP", "Jhon Smit", true, "printed");
    Book book2 = new Book("Java", "Jamil Smit", true, "printed");
    Book book3 = new Book("DLD", "Jovi Smit", true, "e-book");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    Student student = new Student("Shafayet Jamil", 55);
    Teacher teacher = new Teacher("Ayesha Jamil", 54);

        System.out.println("-===========Borrowing Books ============-");
        library.borrowBook("Java", student);
        library.borrowBook("DLD", teacher);
        library.borrowBook("Kotlin", student);


        System.out.println("-===========Returing Books ============-");
        library.returnBook("DLD", student, 9);
        library.returnBook("Java", teacher, 10);

        System.out.println("-===========Search Books ============-");
        library.searchBook("DLD");
        library.searchBook("OOP");


    }
}