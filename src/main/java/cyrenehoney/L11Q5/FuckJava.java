package cyrenehoney.L11Q5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class FuckJava {
    public static void main(String[] args) {
        try (var dis = new DataInputStream(new FileInputStream("person.dat"))) {
            var totalRecords = dis.readInt();
            var people = new Person[totalRecords];

            for (var i = 0; i < totalRecords; i++) {
                var name = dis.readUTF();
                var age = dis.readInt();
                var gender = dis.readChar();
                people[i] = new Person(name, age, gender);
            }

            Arrays.sort(people);

            for (var p : people) {
                System.out.println(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
