package J25_06_13;

public class Square implements Shape{
    private double side_length;

    public Square (double side_length){
        this.side_length = side_length;
    }

    @Override
    public double area() {
        return side_length*side_length;
    }
}
