// Write a function that takes an (unsigned) integer as input, 
// and returns the number of bits that are equal to one in the 
// binary representation of that number.

// Example: The binary representation of 1234 is 10011010010, 
// so the function should return 5 in this case

public class BitCounting {

	public static int countBits(int n)
  {
    String intToBinary = Integer.toBinaryString(n);
    int totalBits = 0;
    for (int i =0; i < intToBinary.length(); i++)
    {
      if (intToBinary.charAt(i ) == '1')
      { 
        totalBits +=1;
      }
    }
    
		return totalBits;
	}
	
}