package lesson.lesson3_task2;

import lesson.lesson3_task2.placeholder.Address;
import lesson.lesson3_task2.placeholder.Company;
import lesson.lesson3_task2.placeholder.Geo;
import lesson.lesson3_task2.placeholder.User;
import lesson.lesson3_task2.vasyaPupkin.Car;
import lesson.lesson3_task2.vasyaPupkin.Gender;
import lesson.lesson3_task2.vasyaPupkin.Model;
import lesson.lesson3_task2.vasyaPupkin.Skills;

import java.util.ArrayList;

public class Mail {
    public static void main(String[] args) {

//        User user = new User(2,"s","sdsa","sdasdsa",
//        new Address("franko","dsds.sds.ds","Lviv",3243432,new Geo(121,121)),42332,"saddasd",
//        new Company("dfsfds","sdfsfsa","asfsfds"));
//        System.out.println(user);

        ArrayList<Skills> skills = new ArrayList<Skills>();
        skills.add(0,new Skills("java",10));
        skills.add(0,new Skills("js",10));
        skills.add(0,new Skills("c++",10));

        Model model = new Model(2,"vasya","Pupkin","asd@asd.com", (byte) 31, Gender.MALE,
                new Car("toyota",2021,250),skills);
        System.out.println(model);
    }
}
