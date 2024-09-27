package liskovSubstitution.solution;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(9, 3);
        System.out.println(rectangle.calculateArea());
        System.out.println("------------------------------------");

        // use square
        Shape square = new Square(3);
        System.out.println(square.calculateArea());

    }
}
