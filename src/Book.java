public class Book {
    private final String title;
    private Status status;

    public Book(String title, Status status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Название книги: " + title +
                ", статус книги: " + status;
    }
}