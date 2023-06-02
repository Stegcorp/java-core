package lesson.lesson2.placeholder;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Post {
    private int userId;
    public int id;
    public String title;
    public String body;
}
