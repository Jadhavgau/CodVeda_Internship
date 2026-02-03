import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;

        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            br.close();

            FileWriter fw = new FileWriter("output.txt");
            fw.write("Number of lines: " + lineCount + "\n");
            fw.write("Number of words: " + wordCount);
            fw.close();

            System.out.println("File processed successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        } catch (IOException e) {
            System.out.println("Error while reading or writing file!");
        }
    }
}
