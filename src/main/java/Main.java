import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        File file = new File("J:\\Story.txt");
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                words.add(scan.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        System.out.println("Words: " + words);
        for(String word : words){
            System.out.println(word);
        }
    }
}
