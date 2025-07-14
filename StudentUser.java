public class StudentUser extends User {
    public StudentUser(String name, int userId) {
        super(name, userId);
    }
    public int getBorrowLimit() {
        return 3;
    }
}

