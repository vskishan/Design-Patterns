package ISP;

/* This interface is a bad idea since OldModel is forced to override
fax and can but without implementation */
public interface Printer {
   public void print();
   public void scan();
   public void fax();
}
