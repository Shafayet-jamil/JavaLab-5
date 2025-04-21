public class Student extends User{
    public Student(String name, int id){
        //student can borrow upto 2 books
        super(name, id, 2);

    }

    @Override
    public int calculateFee(Book book, int lateDays) {
        int regularFee = super.calculateFee(book, lateDays);
        return regularFee/2;//the 50% discount of the student
    }
}
