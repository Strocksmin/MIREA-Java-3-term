class Main {

    public static void main(String[] args) {
        System.out.println("Класс мяч");
        Ball b = new Ball(15, "volleyball");
        System.out.println(b.getRadius());
        System.out.println("\nКласс книга");
        Book book = new Book("11/22/63", "Stiven King", "Romance");
        System.out.println(book);
    }
}
public class Ball {
    private int radius;
    private String type;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ball() {
        radius = 10;
        type = "football";
    }

    public Ball(int r, String t) {
        radius = r;
        type = t;
    }

    public double getVolume()
    {
        return (4/3 * Math.PI * Math.pow(radius, 3));
    }
}

class Book {
    private String name, author, genre;

    public Book(String n, String a, String g) {
        name = n; author = a; genre = g;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}