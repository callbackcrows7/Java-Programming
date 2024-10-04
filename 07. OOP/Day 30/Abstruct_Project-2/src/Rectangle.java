public class Rectangle extends Shape {

    public Rectangle(double dimensionOne, double dimensionTwo) {
        super(dimensionOne, dimensionTwo);

    }

    @Override
    public double draw() {
        return getDimensionOne() * getDimensionTwo();
    }
}
