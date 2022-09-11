package ISP;

//Although Old Model is not capable of performing fax and scan , it is forced to override
public class OldModel implements Printer{
    @Override
    public void print() {
        System.out.println("Prints the text");
    }

    @Override
    public void fax() {
        //Old Model don't have fax capability
    }

    @Override
    public void scan() {
        //Old Model don't have scan capability
    }
}
