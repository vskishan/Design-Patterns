package LSP;

public class Rectangle {

    public Rectangle() {
    }

    protected int height;
    protected int width;

    public Rectangle(int height,int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return width*height;
    }

    //instead of separate class for the Square we can use this
    public boolean isSquare(){
        return height==width;
    }
}
