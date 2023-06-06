package lesson.lesson3_task2.vasyaPupkin;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Skills {
    String title;
    int exp;
}
