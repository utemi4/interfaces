public class App {

    // Функция принимающая объекты интерфейса -
    // "Экземпляры тех классов, которые имплементировали данный интерфейс"
    public static void draw(Drawable drawable) {
        drawable.draw();
    }

    public static void fly(Flyable flyable) {
        flyable.fly();
    }

    public static void main(String[] args) throws Exception {

        // Наследники абстрактного класса
        // Car1 car = new Car1("BMW");
        // Bicycle1 bicycle = new Bicycle1("Ласточка");
        // car.display();
        // bicycle.display();
        // car.move();
        // bicycle.move();

        // Экземпляр класса с исплементацией интерфейса
        // Circle circle = new Circle();
        // circle.draw();
        // draw(circle);

        // Совмещаем абстрактный класс и интерфейс
        // Crow crow = new Crow();
        // Blackbird black = new Blackbird();
        // Plane plane = new Plane();
        // fly(crow);
        // fly(black);
        // fly(plane);

        // Внутренние классы
        // Bicycle2 bicycle2 = new Bicycle2("Torneo", 10);
        // Bicycle2.HandleBar handle = bicycle2.new HandleBar();
        // handle.left();
        // handle.right();
        // handle.up();

        // Вложенный статический класс
        // Library lib = new Library("Moscow, 1");
        // lib.info();
        // Library.Book book = new Library.Book("1984", "Orwell");
        // book.print();

        // Рекорд класс
        // Book book = new Book("Швейк", 10.0);
        // Book other = new Book("Швейк", 10.0);
        // System.out.println(book);
        // System.out.println(book.equals(other));
        // System.out.println(book.name());
        // System.out.println(book.price());

        // Special for GitHub
        System.out.println("Hello, GitHub!");
    }
}

// Рекорд - класс для размещения данных
// Поля не изменяемы, доступен конструктор и геттеры
record Book(String name, Double price) {
}