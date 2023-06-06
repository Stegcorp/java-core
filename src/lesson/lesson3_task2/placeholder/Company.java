package lesson.lesson3_task2.placeholder;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Company {
    String name;
    String catchPhrase;
    String bs;
}
