package lesson.lesson3_task2.vasyaPupkin;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Car {
    String model;
    int year;
    int power;
}
