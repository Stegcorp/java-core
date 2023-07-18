package lesson.lesson6_task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//        Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

        Zooclub zooclub = new Zooclub();
        System.out.println(zooclub);

        Map<Person, List<Pet>> map = new HashMap();
//
        List<Pet> pets = new ArrayList<>();

        pets.add(new Pet( 1,"Brovko"));
        pets.add(new Pet(2,"Dina"));
        pets.add(new Pet(3,"Rex"));

        map.put(new Person(1, "Oleg"), pets);
        map.put(new Person(2, "Stas"), pets);


        System.out.println(zooclub.getClub());

        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
//            System.out.println(next);

        }

    }
}
