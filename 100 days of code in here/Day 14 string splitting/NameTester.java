//given an array of strings with 1 to 3 names
//for each string:
//see if there is a first and last name in the string
//print the initial of the first name and then the last name (Like Mark Smith becomes M. Smith)
// ignore empty names or names without last name


import java.util.ArrayList;

class StringTester
{
	
	String splitNameArray [];
	
	boolean containsWhiteSpace(String value)
	{
		boolean test = false;
		if(  value.contains(" ") )
		{
			test = true;
		}
		return  test;
	}
	//test if array is greater than 1 ?
	//fills array with split name
	void fillArray(String input)
	{
		splitNameArray  = input.split(" ");
	}
	//get 1st intial from array index
	String getFirstLetter()
	{
		String firstLetter = splitNameArray[0].substring(0, 1);
		return firstLetter;
	}
	//get 2nd name from array
	String getSecondsName()
	{
		String lookup = splitNameArray[1];
		return lookup;
	}
	
}
public class NameTester 
{

	public static void main(String[] args) 
	{
		String testData [] = {"bob", "voodo buddha","Yo mama", "james brown", ""};
		
		// TODO Auto-generated method stub
		StringTester st = new StringTester();
		for (int i = 0; i < testData.length;i++)
		{	
			if(st.containsWhiteSpace(testData[i]) )
			{
				st.fillArray(testData[i]);
				String intialName = "";
				intialName += st.getFirstLetter();
				intialName += " " + st.getSecondsName();
				System.out.println("name is valid, first name is " + intialName);
			}
		}
	}

}
