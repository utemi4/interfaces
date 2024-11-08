// Абстрактный класс - класс, для которого нет экземпляров
// Работаем только с наследниками
public abstract class Vehicle {

    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Средство передвижения с именем " + this.name);
    }

    // Абстрактный метод - метод, который не можем определить (и логически)
    // Поэтому переопределяем его в наследниках
    public abstract void move();

}

class Car1 extends Vehicle {

    // Существующие поля можно не переписывать
    // Дополнительных вписывать не будем

    public Car1(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Машина едет");
    }

}

class Bicycle1 extends Vehicle {

    // Существующие поля можно не переписывать
    // Дополнительных вписывать не будем

    public Bicycle1(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Велосипед катится");
    }

}