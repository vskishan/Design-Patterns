package ISP;

//Old Device can now just use the PrintFunc only
public class OldDevice implements PrintFunc{

    @Override
    public void print() {
        System.out.println("Prints the text");
    }
}
