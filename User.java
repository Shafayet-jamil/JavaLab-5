import java.util.Scanner;

public class User{
    private String name;
    private int id;
    private int borrowedBooks;
    private int  mxBooks;

     User(String name, int id, int maxBooks){
         this.mxBooks = maxBooks;
         this.name = name;
         this.id = id;
         this.borrowedBooks = 0;
     }

    public String getName() {
        return name;
    }
    public int getId() {
         return id;
    }

    //it will decrease  the book of a single person
     public void borrowBook(Book book){
        if(borrowedBooks < mxBooks){
            borrowedBooks++;
            System.out.println(name + " has borrowed " + book.getTitle());
        }
         else{
             System.out.println("Not enough books");
         }
     }
     //it  the total fee payable after late return
     public void returnBook(Book book, int lateDays){
         if(borrowedBooks > 0){
             borrowedBooks--;
             int fee = calculateFee(book, lateDays);
             if(fee>0){
                 System.out.println(name + " has returned " + book.getTitle());
                 System.out.println("Late fee " + fee+" tk");
             }
             else{
                 System.out.println("Not late fee " + fee+" tk");
             }

         }
         else{
             System.out.println("Not enough books");

         }

     }

     public int calculateFee(Book book, int lateDays){
   //NO fee for e-books
         if(book.getType().equals("e-book")){
             return 0;
         }
         if(lateDays > 7){
             return (lateDays-7)*5;
         }

         return 0;
     }



}
