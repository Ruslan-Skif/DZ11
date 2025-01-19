public class App {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Петр", "Петров");
        Autor autor2 = new Autor("Иван", "Иванов");

        Book book1 = new Book("Созвездие", autor1, 2002);
        Book book2 = new Book("Уходящие в небо", autor2, 2020);

        System.out.println(book1);
        System.out.println(book2);
        book2.setYearPublishing(1970);
        System.out.println(book2);
    }
}
