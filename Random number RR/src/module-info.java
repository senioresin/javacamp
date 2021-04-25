
	import java.util.Arrays;
	import java.util.Random;
	public class
	{
	   public static void main(String args[]) {
	      double[] arr = new double[5];
	      Random randNum = new Random();
	      for (int i = 0; i < 5; i++) {
	         arr[i] = randNum.nextInt();
	      }
	      System.out.println("Random numbers = "+Arrays.toString(arr));
	   }
	}
