package lesson.lesson4_task3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument{
    int size;
    @Override
    public void play() {

    }
}
