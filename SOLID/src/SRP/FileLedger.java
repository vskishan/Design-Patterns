package SRP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLedger {

    public void journalLog(String journal,String filename) throws IOException {
        if(new File(filename).exists()){
            try(FileWriter writer = new FileWriter(filename)){
                writer.write(journal);
            }
        }
    }
}
