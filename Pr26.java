import java.io.*;

public class Pr26 {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java Pr26 <filename>");
            return;
        }

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        int chars = 0, words = 0, lines = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();

            String w[] = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) {
                words += w.length;
            }
        }

        br.close();

        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}


//Output:
//Characters: 27
//Words: 4
//Lines: 2
