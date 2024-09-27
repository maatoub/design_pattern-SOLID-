package liskovSubstitution.problem;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(9);
        rectangle.setWidth(3);
        if (rectangle.calculateArea() == 27) {
            System.out.println("Bravooo...");
        }
        System.out.println(rectangle.calculateArea());

        System.out.println("------------------------------------");

        // use square
        Rectangle square = new Square();
        square.setHeight(9);
        square.setWidth(3);
        if (square.calculateArea() == 27) {
            System.out.println("Bravooo...");
        }
        System.out.println(rectangle.calculateArea());

    }
}
