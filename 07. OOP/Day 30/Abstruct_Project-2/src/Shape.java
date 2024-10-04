public abstract class Shape {
    private double dimensionOne, dimensionTwo;

    public Shape(double dimensionOne, double dimensionTwo) {
        this.dimensionOne = dimensionOne;
        this.dimensionTwo = dimensionTwo;
    }

    public double getDimensionOne() {
        return dimensionOne;
    }
    
    public double getDimensionTwo() {
        return dimensionTwo;
    }

    public abstract double draw();
}
