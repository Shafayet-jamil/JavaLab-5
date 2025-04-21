public class Library {
    private Book[] books;
    private int numBooks;//to keep count the number of books

    public Library() {
        books = new Book[100];
        numBooks=0;
    }
    public void addBook(Book book) {
           if(numBooks<books.length) {
               books[numBooks] = book;
               numBooks++;
               System.out.println("Book added to the library " + book.getTitle());
           }
           else{
               System.out.println("Book library is already full");
           }
    }
    public Book searchBook(String title) {
       for(int i=0; i<numBooks; i++) {
           if(title.equalsIgnoreCase(books[i].getTitle())){
               System.out.println("Book found in library " + books[i].getTitle());
               books[i].displayBookInfo();
               return books[i];
           }
       }
       System.out.println("Book not found in library");
       return null;
    }
    public void borrowBook(String title, User user) {
         Book book = searchBook(title);
         if(book != null && book.isAvailable()) {
             book.setAvailable(false);
             user.borrowBook(book);
             System.out.println("Book borrowed from library " + book.getTitle());

         }
         else{
             System.out.println("Book not found in library");
         }
    }
    public void returnBook(String title, User user, int lateDays) {
      Book book = searchBook(title);
      if(book != null && book.isAvailable()) {
          book.setAvailable(true);
          user.returnBook(book, lateDays);
          System.out.println("Book returned from library " + book.getTitle());

      }
      else{
          System.out.println("Book not found in library");
      }
     }
}
