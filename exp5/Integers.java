import java.io.*;
import java.util.*;

public class Integers {
    public static void main(String[] args) throws Exception {
        FileReader fin = new FileReader("integers.txt");
        BufferedReader bin = new BufferedReader(fin);

        StringTokenizer st = new StringTokenizer(bin.readLine(), " ");
        int sum = 0, integer;

        while (st.hasMoreTokens()) {
            integer = Integer.parseInt(st.nextToken());
            System.out.println(integer);
            sum += integer;
        }

        System.out.println("Sum: " + sum);

        bin.close();
        fin.close();
    }
}
