public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return (Math.PI * (2 * radius));
    }
    public double getSquare()
    {
        return (Math.PI * Math.pow(radius, 2));
    }
}
class CircleTest {
    public static void main(String[] args)
    {
        Circle cir = new Circle(5);
        System.out.println("Радиус окружности равен: " + cir.getRadius() + " Длина окружности равна: " + cir.getLength() + " Площадь окружности равна: " + cir.getSquare());
        cir.setRadius(10);
        System.out.println("Радиус окружности равен: " + cir.getRadius() + " Длина окружности равна: " + cir.getLength() + " Площадь окружности равна: " + cir.getSquare());
    }
}

