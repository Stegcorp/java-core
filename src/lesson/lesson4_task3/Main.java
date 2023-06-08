package lesson.lesson4_task3;

import lesson.lesson4_task3.instrument.Drum;
import lesson.lesson4_task3.instrument.Guitar;
import lesson.lesson4_task3.instrument.Instrument;
import lesson.lesson4_task3.instrument.Tube;
import lesson.lesson4_task3.interfaceprintable.Book;
import lesson.lesson4_task3.interfaceprintable.Magazine;
import lesson.lesson4_task3.interfaceprintable.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        Printable book = new Book();
//        Printable magazine = new Magazine();
//        Printable[] printable = {book, magazine};
        Instrument guitar = new Guitar(4);
        Instrument drum = new Drum(45);
        Instrument tube = new Tube(3);
        Instrument[] instrument = {guitar,drum,tube};
        for (Instrument instrument1 : instrument) {
            System.out.println("play - " + instrument1);
        }
    }
}
