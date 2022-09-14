import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Authors {

    private String firstname;
    private String surname;

    public String toString() {
        return firstname + " " + surname;
    }
}