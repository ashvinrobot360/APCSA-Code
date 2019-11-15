import java.util.*;

public class WorkerPay {
	public static void main(String[] args) {
		String[] names = new String[5];
		double[][] arrayNumbers = new double[3][5];
		Scanner console = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("What's the name? ");
			names[i] = console.next();
			for(int j = 0; j < 3;j++) {
				if(j == 0) {
					System.out.println("What's the number of hours? ");
					arrayNumbers[j][i] = console.nextDouble();
				}
				if(j == 1) {
					System.out.println("What's the pay rate? ");
					arrayNumbers[j][i] = console.nextDouble();
				}
				if(j == 2) {
					arrayNumbers[j][i] = arrayNumbers[j-2][i] * arrayNumbers[j-2][i];
				}
				
				
			}
			
		}
		System.out.println("Names: " + Arrays.toString(names));
		System.out.println("Hours, Pay Rate, Money Paid: " + Arrays.deepToString(arrayNumbers));
		

	}

}
