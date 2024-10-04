public class App {
    public static void main(String[] args) throws Exception {
        Shape shape; // Creating a reference variable

        shape = new Rectangle(5, 10); // Creating a Rectangle object and assigning it to the reference variable
        double rectangleArea = shape.draw();
        System.out.println("Area of Rectangle: " + rectangleArea);

        shape = new Triangle(5, 10); // Creating a Rectangle object and assigning it to the reference variable
        double triangleArea = shape.draw();
        System.out.println("Area of Triangle: " + triangleArea);

        shape = new Circle(10); // Creating a Rectangle object and assigning it to the reference variable
        double circleRadius = shape.draw();
        System.out.println("Radius of Circle: " + circleRadius);
    }
}
