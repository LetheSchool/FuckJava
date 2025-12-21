package cyrenehoney.L8Q2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonProfile {
    private String name;
    private String gender;
    private String dateOfBirth;

    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display() {
        System.out.println("Full Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}