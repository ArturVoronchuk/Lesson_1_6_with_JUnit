public class User {
    String name;
    String surname;
    String email;
    static int totalOnline;

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        totalOnline++;
    }
}