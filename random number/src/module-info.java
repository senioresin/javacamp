import java.util.Random;

public class NumberList {
    private static double[] anArray;

    public static double[] list() {
        return new double[10];
    }
    
    public static void print(){
        System.out.println(String.join(" ", anArray);
    }

    public static double randomFill() {
        return (new Random()).nextInt();
    }
    
    public static void main(String args[]) {
        // TODO
    }
}