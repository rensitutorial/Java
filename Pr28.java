import java.io.*;

public class Pr28 {
    public static void main(String[] args) {
        BufferedReader br = null;

        int lines = 0, words = 0, chars = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String w[] = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += w.length;
                }

                chars += line.replaceAll("\\s", "").length();
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
//output:Lines: 2
//Lines: 2
//Words: 6
//Characters: 25
