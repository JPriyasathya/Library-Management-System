public class FacultyUser extends User {
    public FacultyUser(String name, int userId) {
        super(name, userId);
    }
    public int getBorrowLimit() {
        return 5;
    }
}
