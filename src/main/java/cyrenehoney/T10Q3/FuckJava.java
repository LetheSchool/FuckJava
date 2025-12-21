package cyrenehoney.T10Q3;

import java.util.Arrays;

public class FuckJava {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Charlie");
        people[1] = new Person("Alice");
        people[2] = new Person("Bob");

        Arrays.sort(people);

        for (Person p : people) {
            p.display();
        }
    }
}
