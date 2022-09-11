import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int result1;
        if (x>0){
            result1 = x;
        }else {
            result1 = -x;
        }

        int result2;
        if (y>0){
            result2 = y;
        }else {
            result2 = -y;
        }

        int result3;
        if (z>0){
            result3 = z;
        }else {
            result3 = -z;
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}