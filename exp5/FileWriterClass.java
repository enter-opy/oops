import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterClass { 
    public static void main(String[] args) throws Exception {
        FileWriter fout = new FileWriter("writefile.txt");
    
        fout.write("Vivek Vijayan\nChanganacherry Kaviyoor Rd");

        fout.close();

        FileReader fin = new FileReader("writefile.txt");
        BufferedReader bin = new BufferedReader(fin);

        String name = bin.readLine(), address = bin.readLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        bin.close();
        fin.close();
    }
}
