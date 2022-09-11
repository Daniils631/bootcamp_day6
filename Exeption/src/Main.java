import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Examin an exeption in main method");
        }

        /*File file = new File("test");
        try {
            Scanner sc = new Scanner(file);
            System.out.println("After Scanner!");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found!");
        }
        System.out.println("After try, catch! Hello world!");*/
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("tests");
        Scanner sc = new Scanner(file);
    }
}