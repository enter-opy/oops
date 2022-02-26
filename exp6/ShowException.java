import java.io.FileInputStream;

public class ShowException {
    public static void main(String[] args) {
        // Arithmetic Exception handling
        try {
            int x = 100 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }

        // Array out of index Exception handling
        try {
            int arr[] = new int[5];
            arr[10] = 5;
        } catch (Exception e) {
            System.out.println(e);
        }

        // File not found Exception handling
        try {
            FileInputStream fin = new FileInputStream("nonExistent.txt");
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}