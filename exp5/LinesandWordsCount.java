import java.io.*;

public class LinesandWordsCount {
    public static void main(String[] args) throws Exception {
        FileReader fin = new FileReader("capitalswordslines.txt");
        BufferedReader bin = new BufferedReader(fin);

        int characters = 0, words = 0, lines = 0;
        String line = bin.readLine();
        
        while(line != null) {
            lines++;

            for (int i = 0; i < line.length(); i++) {
                if (Character.isWhitespace(line.charAt(i))) {
                    words++;
                } else {
                    characters++;
                }        
            }

            words++;

            line = bin.readLine();
        }

        System.out.println("Number of characters: " + characters);
        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);

        bin.close();
        fin.close();
    }
}