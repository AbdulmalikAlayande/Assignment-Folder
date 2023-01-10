package Chapter4;

import java.util.Scanner;

public class PrivacyCryptography {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the four digit integer data you want to encrypt: ");
		int fourDigit = input.nextInt();

		int dig1 = fourDigit/1000;
		int dig2 = fourDigit%1000/100;
		int dig3 = fourDigit%100/10;
		int dig4 = fourDigit%10;

			int dig1Plus7 = dig1 + 7;
			int dig2Plus7 = dig2 + 7;
			int dig3Plus7 = dig3 + 7;
			int dig4Plus7 = dig4 + 7;

				int Modulo10_OfDig1plus7 = dig1Plus7 % 10;
				int Modulo10_OfDig2plus7 = dig2Plus7 % 10;
				int Modulo10_OfDig3plus7 = dig3Plus7 % 10;
				int Modulo10_OfDig4plus7 = dig4Plus7 % 10;


		System.out.println("Your data is now encrypted to: "+Modulo10_OfDig3plus7 + Modulo10_OfDig4plus7 + Modulo10_OfDig1plus7 + Modulo10_OfDig2plus7);

		   // DECRYPTOR
		  int dig1GettingReversed = Modulo10_OfDig1plus7 + 10;
		  int dig2GettingReversed = Modulo10_OfDig2plus7 + 10;
		  int dig3GettingReversed = Modulo10_OfDig3plus7 + 10;
		  int dig4GettingReversed = Modulo10_OfDig4plus7 + 10;

		  int dig1FullyReversed = dig1GettingReversed - 7;
		  int dig2FullyReversed = dig2GettingReversed - 7;
		  int dig3FullyReversed = dig3GettingReversed - 7;
		  int dig4FullyReversed = dig4GettingReversed - 7;

		System.out.println("Your data is now decrypted back to: "+dig1FullyReversed + dig2FullyReversed + dig3FullyReversed + dig4FullyReversed);



		int counter = 4;
		int modulo = 10;	int divisor = 1;

		while (counter >= 1) {
			int seperatedDigit = (fourDigit % modulo / divisor);    
			int plusSeven = seperatedDigit + 7;
			int modulo10 = plusSeven % 10;

					System.out.print(modulo10);     //"Digit "+counter+" is now "+
					counter--;
					modulo *= 10;
					divisor *= 10;
			}

//		System.out.println("divisor is now: "+divisor);
//		System.out.println("modulo is now: "+modulo);

	}
}
