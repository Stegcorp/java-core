package lesson.lesson4_task3.instrument;

import lombok.Data;

@Data
public class Guitar implements Instrument{
    int numOfStrings;
    @Override
    public void play() {

    }

    public Guitar(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }
}
