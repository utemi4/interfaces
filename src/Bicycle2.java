public class Bicycle2 {

    private String model;
    private int weight;

    public Bicycle2(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Велосипед модели " + this.model + " весом " + this.weight);
    }

    // Внутренний класс
    public class HandleBar {

        public void right() {
            System.out.println("Поворот направо");
        }

        public void left() {
            System.out.println("Поворот налево");
        }

        // Доступ к полям и методам внешнего класса
        public void up() {
            Bicycle2.this.info();
        }
    }

}
