public class Triangle extends Shape {
    
    public Triangle(double dimensionOne, double dimensionTwo) {
        super(dimensionOne, dimensionTwo);

    }

    @Override
    public double draw() {
        return 0.5 * getDimensionOne() * getDimensionTwo();
    }
}
