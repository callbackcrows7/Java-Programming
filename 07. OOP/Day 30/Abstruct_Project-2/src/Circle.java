public class Circle extends Shape {

    public Circle(double r) {
        super(r, r);

    }

    @Override
    public double draw() {
        return Math.PI * getDimensionOne() * getDimensionTwo();
    }
}
