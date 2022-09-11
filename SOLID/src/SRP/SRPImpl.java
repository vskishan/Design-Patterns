package SRP;

public class SRPImpl {
    public static void main(String[] args) throws Exception{
        Journal journal = new Journal();
        FileLedger ledger = new FileLedger();

        //Absolute path of the File
        String path = "C:\\Users\\vbasireddy\\Desktop\\Design-Patterns\\SOLID\\src\\SRP\\JournalLog.txt";

        //Adding entries into journal
        journal.addEntry("9-9-2022  :   +$5000");
        journal.addEntry("10-9-2022 :   -$2500");

        //Write Journal entries into File
        ledger.journalLog(journal.toString(),path);

        //Printing the contents of journal
        System.out.println(journal);

        //Removing entry from journal
        journal.deleteEntry(0);
        System.out.println(journal);

        //Overwrite Journal entries into File after journal update
        ledger.journalLog(journal.toString(),path);
    }
}