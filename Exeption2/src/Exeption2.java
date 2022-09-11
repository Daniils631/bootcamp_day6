import java.io.IOException;
import java.util.Scanner;

public class Exeption2 {
    public static void main(String[] args) throws ScannerExeption {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
        if (x != 0){
            throw new ScannerExeption("User input something beside ZERO");


            /*try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("You input somthing besides Zero");
            }*/
        }
    }
}
}