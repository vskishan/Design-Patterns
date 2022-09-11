package ISP;

//
public class LatestDevice implements PrintFunc,ScanFunc{

    @Override
    public void print() {
        System.out.println("Prints the text");
    }

    public void scan(){
        System.out.println("Scans the text");
    }
}
