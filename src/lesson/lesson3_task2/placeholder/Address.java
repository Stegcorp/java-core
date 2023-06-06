package lesson.lesson3_task2.placeholder;


import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Address {
    String street;
    String suite;
    String city;
    int zipcode;
    Geo geo;
}
