import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeption3 {
    public static void main(String[] args) {
        //Checked exception(Complete time exception)
        //Unchecked exception (Runtime exception)

        //Unchecked Exceptions
        //1) int a = 1/0;
        /*2) String name = null;
        name.length();*/
        // 3)
        int[] arr = new int[2];
        System.out.println(arr[2]);




        /*File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }*/


        //System.out.println("Hello world!");
    }
}