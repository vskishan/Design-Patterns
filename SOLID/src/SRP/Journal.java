package SRP;

import java.util.List;
import java.util.ArrayList;

class Journal{
    private final List<String> entries = new ArrayList<>();
    private static final int count = 0;

    public void addEntry(String entry){
        entries.add(entry);
    }

    public void deleteEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString(){
        return String.join(System.lineSeparator(),entries);
    }
}