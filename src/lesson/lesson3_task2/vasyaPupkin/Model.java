package lesson.lesson3_task2.vasyaPupkin;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@ToString
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Model implements Comparable<Model> {
        int id;
        String name;
        String surname;
        String email;
        int age;
        Gender gender;
        Car car;
        ArrayList<Skills> skills= new ArrayList<>();

    public Model() {
    }

    public Model(int id, String name, String surname, String email, int age, Gender gender, Car car, ArrayList<Skills> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return id == model.id && age == model.age && Objects.equals(name, model.name) && Objects.equals(surname, model.surname) && Objects.equals(email, model.email) && gender == model.gender && Objects.equals(car, model.car) && Objects.equals(skills, model.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, age, gender, car, skills);
    }

    @Override
    public int compareTo(Model o) {
        return this.skills.size() - o.skills.size();
    }
}

