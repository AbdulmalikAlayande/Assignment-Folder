package Chapter6;

import java.security.SecureRandom;

public class RollDieWithArray {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int[] frequency = new int[7];
		 frequency[3] = 42;
		for (int rolls = 0; rolls < 100; rolls++) {
		   ++frequency[1 + random.nextInt(6)];
		}
		for (int i = 1; i < frequency.length; i++) {
			System.out.print("face "+i+" was generated "+frequency[i]+" times and the bar graph --> ");
			for (int j = 0; j < frequency[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//System.out.println("The frequency of "+i+" is "+frequency[i]);
