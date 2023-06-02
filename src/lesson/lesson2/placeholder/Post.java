package lesson.lesson2.placeholder;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Post {
     int userId;
     int id;
     String title;
     String body;
}
