package openClosed.problem;

public class ShapePrinter {

    public void shapeDrawer(Object shape) {
        if (shape instanceof Rectangle) {
            System.out.println("drawing rectangle");
        } else if (shape instanceof Square) {
            System.out.println("drawing square");
        }
    }
}
