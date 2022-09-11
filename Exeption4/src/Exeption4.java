import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exeption4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e){

        }
        // All exceptions like ParseException dont nedd if we do Exception like in line 9
        /*catch (ParseException p){
    }*/

        /*catch (IOException | ParseException e) {
            e.printStackTrace();
        } */


    }
    public static void run() throws IOException, ParseException, IllegalArgumentException{


    }
}