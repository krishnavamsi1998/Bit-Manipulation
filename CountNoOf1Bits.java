package bitManipulation;

//Write a function that takes an unsigned 
//integer and returns the number of '1' bits it has (also known as the Hamming weight).
//O(32),O(1)
//in java , TLE , try in python 
public class CountNoOf1Bits {

	public static void main(String[] args) {

		int n = 00000000000000000000000000001011;

		// till n becomes 0
		int res = 0;

		while (n != 0) {
			// logic for count 1
			res += n % 2;
			// shift right side
			n = n >> 1;

		}
		System.out.println(res);

	}

}
