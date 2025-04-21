public class Teacher extends User{

    public Teacher(String name, int id) {
        super(name, id, 3);

    }

    @Override
    public int calculateFee(Book book, int lateDays) {
        return  0;
    }
}
