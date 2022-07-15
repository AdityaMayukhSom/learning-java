public class CodingExercise39 {
    public static void main(String[] args) {

    }
}

class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Holden -> startEngine()";
    }

    public String accelerate() {
        return "Holden -> accelerate()";
    }

    public String brake() {
        return "Holden -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Ford -> startEngine()";
    }

    public String accelerate() {
        return "Ford -> accelerate()";
    }

    public String brake() {
        return "Ford -> brake()";
    }
}
