package lesson.lesson2;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PUBLIC)

public class Dog {
    String name;
    byte age;
    String poroda;
}
