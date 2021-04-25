
import java.util.Random;

public class NumberList {
    private static CharSequence[] anArray;

    public static double[] list() {
        return new double[10];
    }
    
    public static void print(){
        System.out.println(String.join("0", anArray));
    }

    public static double randomFill() {
        return (new Random()).nextInt();
    }
    
    public static void main(String args[]) {
    }
}