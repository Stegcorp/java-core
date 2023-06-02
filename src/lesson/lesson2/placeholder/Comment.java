package lesson.lesson2.placeholder;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Comment {
    int postId;
    int id;
    String name;
    String email;
    String body;
}
