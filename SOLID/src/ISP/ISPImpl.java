package ISP;

public class ISPImpl {
    public static void main(String[] args) {

        //Without ISP
        LatestModel latestModel = new LatestModel();
        latestModel.scan();
        latestModel.print();

        OldModel oldModel = new OldModel();
        oldModel.scan(); // Does nothing hence causing ambiguity to user
        oldModel.print();
        oldModel.fax(); // Does nothing hence causing ambiguity to user

        //Using ISP
        LatestDevice latestDevice = new LatestDevice();
        latestDevice.print();
        latestDevice.scan();

        OldDevice oldDevice = new OldDevice();
        oldDevice.print();
    }
}
