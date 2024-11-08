public interface Flyable {
    void fly();
}

interface Singing {

}

abstract class Bird implements Flyable, Singing {

}

class Crow extends Bird {

    @Override
    public void fly() {
        System.out.println("Crow is flying.");
    }
}

class Blackbird extends Bird {

    @Override
    public void fly() {
        System.out.println("Blackbird is flying.");
    }
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Plane is in air.");
    }
}