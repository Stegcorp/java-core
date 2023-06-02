package lesson.lesson2;

public class Car {
   private String model;
   private int power;
   private int volumeEngine;
   private String turbo;

    public Car() {
    }

    public Car(String model, int power, int volumeEngine, String turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(int volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volumeEngine=" + volumeEngine +
                ", turbo='" + turbo + '\'' +
                '}';
    }
}

