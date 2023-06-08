package lesson.lesson4_task3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tube implements Instrument{
    int diameter;
    @Override
    public void play() {

    }
}
