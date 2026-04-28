import java.io.*;

public class Pr27 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");

            fw.write("101 Amit 85\n");
            fw.write("102 Neha 90\n");
            fw.write("103 Rahul 78\n");

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e);
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Closing Error: " + e);
            }
        }
    }
}
//output: Student Records:
//101 Amit 85
//102 Neha 90
//103 Rahul 78
