/*
Write a method that will search an array of strings for all strings 
that contain another string, ignoring capitalization. 
Then return an array of the found strings.

The method takes two parameters, the query string and the array of strings to search, 
and returns an array.

If the string isn't contained in any of the strings in the array, 
the method returns an array containing a single string: "Empty" 
(or Nothing in Haskell, or "None" in Python)

Examples
If the string to search for is "me", 
and the array to search is ["home", "milk", "Mercury", "fish"], 
the method should return ["home", "Mercury"].
*/

class WordSearch 
{
  static String[] findWord(String x, String[] y)
  {
   
    System.out.println("y array length is " + y.length + " string x is "  + x );
    int count = 0;
    for (int i = 0; i < y.length; i++)
    {
       if( y[i].toLowerCase().contains(x.toLowerCase() ) )
       {  
           System.out.println(y[i]);
           count ++;
       }

    }
    
    if (count == 0)
    {
      return new String[] { "Empty"};
    }

    String [] newArray = new String[count];
    System.out.println("count is "  + count);
    int count2 = 0;
    for (int i = 0; i < y.length; i++)
    {
       if( y[i].toLowerCase().contains(x.toLowerCase() ) )
       {  
         newArray[count2] = y[i];
         count2 +=1;
       }
    }
    return newArray;
  }
}