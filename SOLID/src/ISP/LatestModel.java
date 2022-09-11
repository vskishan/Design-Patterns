package ISP;

public class LatestModel implements Printer{
    @Override
    public void print(){
        System.out.println("Prints the text");
    }

    @Override
    public void fax(){
        System.out.println("Faxes the text");
    }

    @Override
    public void scan(){
        System.out.println("Scans the text");
    }
}
