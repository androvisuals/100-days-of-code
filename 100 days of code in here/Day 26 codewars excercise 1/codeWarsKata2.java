// Task:
// Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even.
// Give your answer in string format as 'odd' or 'even'.
// If the input array is empty consider it as: [0] (array with a zero).
// Example:
// oddOrEven([2, 5, 34, 6]) returns "odd".
// Have fun!

public class Codewars 
{
  
  public static String oddOrEven (int[] array) 
  {
      int sum = 0;
      String result = "";
     for(int i=0; i < array.length;i++)
     {
         sum+=array[i];
     }
     if ( (sum & 1) == 0 ) 
     { 
       result = "even"; 
     } else 
     { 
       result = "odd"; 
     }
     return result;
  }
}