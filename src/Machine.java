// Запечатанный класс, надо указывать наследников
public sealed class Machine permits Car, Bike {
    private String brand;

    public Machine(String br) {
        this.brand = br;
    }

    public void info() {
        System.out.println("Brand '" + this.brand + "'");
    }
}

final class Car extends Machine {
    public Car(String br) {
        super(br);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Of Car");
    }
}

non-sealed class Bike extends Machine {
    public Bike(String br) {
        super(br);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Of Bike");
    }
}