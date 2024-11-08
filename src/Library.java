public class Library {
    private String address;

    public Library(String add) {
        this.address = add;
    }

    public void info() {
        System.out.println(this.address);
    }

    // Вложенный статический класс
    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.author = author;
            this.title = title;
        }

        public void print() {
            System.out.println("'" + this.title + "' by " + this.author);
        }
    }
}
