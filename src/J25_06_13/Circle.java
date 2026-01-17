package J25_06_13;

public class Circle implements Shape{
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
