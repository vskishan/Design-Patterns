package LSP;

public class RectangleFactory {

    public static Rectangle createRectangle(int height,int width){
        return new Rectangle(height,width);
    }

    public static Rectangle createSquare(int size){
        return new Rectangle(size,size);
    }
}
