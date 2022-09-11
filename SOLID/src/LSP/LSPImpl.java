package LSP;

public class LSPImpl {

    static void getShapeArea(Rectangle rectangle){
        int width = rectangle.getWidth();
        rectangle.setHeight(9);
        System.out.println("Expected Area : "+width*9);
        System.out.println("Actual Area: "+rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,9);
        getShapeArea(rectangle);

        //Trying to violate LSP
        Rectangle square = new Square(5);
        getShapeArea(square);

        //Solution 1
        Rectangle rect1 = new Rectangle(5,4);
        Rectangle sq1 = new Rectangle(4,4);
        if(sq1.isSquare()) System.out.println("Area of square with boolean check = "+sq1.getArea());
        if(!rect1.isSquare()) System.out.println("Area of rectangle with boolean check = "+rect1.getArea());

        //Solution 2 using Factory Pattern
        RectangleFactory rectangleFactory = new RectangleFactory();
        Rectangle rect_shape = rectangleFactory.createRectangle(5,4);
        Rectangle sq_shape = rectangleFactory.createSquare(4);
        System.out.println("Area of square using Factory : "+sq_shape.getArea());
        System.out.println("Area of rectangle using Factory : "+rect_shape.getArea());
    }
}
