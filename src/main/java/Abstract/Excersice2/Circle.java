package Abstract.Excersice2;

public class Circle implements IShape {
    private double radius;
    private double pi = 3.14;

    public  Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
