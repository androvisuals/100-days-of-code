// Complete the solution so that it returns true if the first argument(string) 
// passed in ends with the 2nd argument (also a string).

// Examples:

// solution('abc', 'bc') // returns true
// solution('abc', 'd') // returns false

public class Kata 
{
  public static boolean solution(String str, String ending) 
  {
  	if (endingLength > str)
  	{
  		return false;
  	}
    int endingLength = ending.length();
    String finalEnding = "";
    finalEnding += str.substring( str.length()-endingLength,str.length() );
    if (ending.equals(finalEnding ) )
    {  
        return true;
    }
    return false;
  }
}