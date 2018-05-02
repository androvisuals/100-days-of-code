// Can you find the needle in the haystack?
// Write a function findNeedle() that takes an array full of junk but containing one "needle"
// After your function finds the needle it should return a message (as a string) that says:
// "found the needle at position " plus the index it found the needle, so:
//Java
// findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
// should return
// "found the needle at position 5"

public class Kata 
{
  String index ="";
  String findIt(Object [] isItNeedle, int key)
  {
    index = (String) String.valueOf(isItNeedle[key]);
    return index;
  }

  public static String findNeedle(Object[] haystack) 
  {
    String lookup = null;
    Kata findNeedle = new Kata();

    for(int i = 0; i < haystack.length;i++)
    {
      lookup = findNeedle.findIt(haystack,i)  ;
      System.out.println("lookup is at index " + i + " "  + lookup);
      if (lookup.equals("needle"))
      {
        lookup = String.valueOf(i);
        break;
      }
    }
    String result = "found the needle at position " + lookup;
    return result;
  }
}