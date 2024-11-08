// Интерфейс - Набор методов
public interface Drawable {
    void draw();
}

// Класс должен реализвать методы, если имплементирует интерфейс
class Circle implements Drawable {

    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("Круг нарисован");
    }

}
