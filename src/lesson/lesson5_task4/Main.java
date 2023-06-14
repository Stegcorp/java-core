package lesson.lesson5_task4;

import lesson.lesson3_task2.vasyaPupkin.Car;
import lesson.lesson3_task2.vasyaPupkin.Gender;
import lesson.lesson3_task2.vasyaPupkin.Model;
import lesson.lesson3_task2.vasyaPupkin.Skills;

import java.util.*;

public class Main {
    public static void main(String[] args) {


//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User(1,"Vasia",32));
//        users.add(new User(2,"Olesia",22));
//        users.add(new User(3,"Petro",42));
//        users.add(new User(3,"Olga",33));
//        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
//        users.sort((o1, o2) -> o1.getName().length()-o2.getName().length());
//        users.sort((o1, o2) -> o2.getName().length()-o1.getName().length());
//        System.out.println(users);


//        List<String> strings1 = new ArrayList<>();
//        strings1.add("java");
//        strings1.add("apple");
//        strings1.add("grass");
//        strings1.add("house");
//        strings1.add("elephant");
//        strings1.add("star");
//        strings1.add("night");
//        strings1.add("sheep");
//        strings1.add("book");
//        strings1.add("car");
//        strings1.add("left");
//        strings1.add("craft");
//        strings1.add("bar");
//        strings1.add("coffee");
//        strings1.add("mouse");
//        strings1.add("mountain");
//        strings1.sort((o1, o2) -> o1.compareTo(o2));
//        System.out.println(strings1);

        ArrayList<Skills> skills = new ArrayList<>();
        skills.add(new Skills("java",12));
        skills.add(new Skills("css",3));
        skills.add(new Skills("html",3));
        Model model = new Model(1,"petro","pupkin","dasdsa@sdsa.sdas",22, Gender.MALE,
                new Car("tesla",2021,345),skills);
        HashSet<Model> users = new HashSet<>();
        users.removeIf(user -> user.getGender() == Gender.MALE);
        TreeSet<Model> models = new TreeSet<>();

    }
}
