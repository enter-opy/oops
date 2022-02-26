import java.io.*;

public class LinebyLine {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("capitalslinebyline.txt");

        int i = 0, j = 1;
        while ((i = fin.read()) != -1) {
            if (j == 1) {
                System.out.print(j + ". ");
                j++;
            }

            if ((char) i == '\n') {
                System.out.print("\n" + j + ". ");
                j++;
            } else {
                System.out.print((char) i);
            }
        }

        fin.close();
    }
}