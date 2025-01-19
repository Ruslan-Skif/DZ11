public class Book {
    private String title;
    private Autor autor;
    private int yearPublishing;

    @Override
    public String toString() {
        return "Книга: " + title + ". Автор: " + autor + ". Год издания: " + yearPublishing + ".";
    }

    public Book(String title, Autor autor, int yearPublishing) {
        this.title = title;
        this.yearPublishing = yearPublishing;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
