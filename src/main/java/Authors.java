public class Authors {

    String firstname;
    String surname;

    public Authors(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String toString() {
        return firstname + " " + surname;
    }
}