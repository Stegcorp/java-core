package lesson.lesson3_task2.vasyaPupkin;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@ToString
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Model {
        int id;
        String name;
        String surname;
        String email;
        int age;
        Gender gender;
        Car car;
        ArrayList<Skills> skills= new ArrayList<>();

    public Model(int id, String name, String surname, String email, byte age, Gender gender, Car car, ArrayList<Skills> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
        this.skills = skills;
    }
}
