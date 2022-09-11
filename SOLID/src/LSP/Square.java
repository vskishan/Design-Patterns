package LSP;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(int side) {
        width = height = side;
    }

    @Override
    public void setWidth(int width){
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height){
        this.height = height;
        this.width = height;
    }
}
