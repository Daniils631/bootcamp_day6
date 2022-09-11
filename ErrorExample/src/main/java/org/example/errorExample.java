package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class errorExample {

    //private static ABC abc = new ABC();

    public static void foo(){
        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

/*        //System.out.println(1/0);
//        int array [] = {1,2,3};
//        array[5] = 3;
        try{
            abc.show();
            System.out.println(1/0);
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
//            System.err.println("Divided by Zero");
        }*/


}
}