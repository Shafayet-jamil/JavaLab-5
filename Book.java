public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private String type;//e-book or printed
    Book(String title, String author, boolean isAvailable, String type) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.type = type;

    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    void displayBookInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Type: " + this.type);

    }


}
