//Studies using the ArrayList object
import java.util.ArrayList;
import java.util.Collections;

//MathTester class is used to study putting objects 
//into a list array and calling methods upon them
//Arraylist with objects is more powerful than standard 
//arrays as the list can be altered in size.
class StringTester
{
	private String result="";

	String getString()
	{
		return result;
	}
	
	void setString(String set)
	{
		result = set;
	}

	String mergeStrings(String x, String y )
	{
		String mergeThem = x + " " +  y;
		result = mergeThem;

		return result;
	}
}

public class ArrayListStringTester
{
	public static void main (String[] args)
	{
		//used for all ArrayList tests
		int arrayLength = 5;
		
		//ArrayList with String
		ArrayList<String> stringList_1 = new ArrayList<String>(arrayLength);
		Collections.addAll(stringList_1, "alpha", "bravo", "charlie", "delta");
		System.out.println("Values of stringList_1 are " + stringList_1);
		stringList_1.add("foxtrot");
		System.out.println("After adding a new index stringList_1 is " + stringList_1);
		
		//index look up
		int isIndexPresent = -1;
		isIndexPresent =  stringList_1.indexOf("charlie");
		System.out.println("charlie is at index " + isIndexPresent);
		
		//Shuffle the list find new index again
		Collections.shuffle(stringList_1);
		System.out.println("After list is shuffled it becomes " + stringList_1);
		isIndexPresent =  stringList_1.indexOf("charlie");
		System.out.println("charlie is at index " + isIndexPresent);

		//use method to create a new index by adding 2 of them together
		ArrayList<StringTester> stringObjectTester_1 = new ArrayList<StringTester>();
		
		//create two new StringTester objects add to the array list
		StringTester sTest_1 = new StringTester();
		stringObjectTester_1.add(sTest_1);
		StringTester sTest_2 = new StringTester();
		stringObjectTester_1.add(sTest_2);

		stringObjectTester_1.get(0).setString("The bird flies");
		System.out.println("sTest_1 output is " + stringObjectTester_1.get(0).getString());

		stringObjectTester_1.get(1).setString("over the horizon");
		System.out.println("sTest_2 output is " + stringObjectTester_1.get(1).getString());

		//make a new object to test the merge
		StringTester sTest_3 = new StringTester();
		stringObjectTester_1.add(sTest_3);

		//lookup 2 object strings with methods and then add them together
		//not at all the best way to do it just practising how to use methods on
		//arraylist objects
		stringObjectTester_1.get(2).mergeStrings(stringObjectTester_1.get(0).getString(),
													stringObjectTester_1.get(1).getString());
		
		System.out.println("sTest_3 output is " + stringObjectTester_1.get(2).getString());

		//tryout with reference's 
		stringObjectTester_1.set(0,stringObjectTester_1.get(1));
		String stringExtract = "";
	
		for(int i = 0; i < stringObjectTester_1.size();i++)
		{

			stringExtract += stringObjectTester_1.get(i).getString();
			stringExtract += " ";
		}
		System.out.println(stringExtract);
		
		//System.out.println(stringTester_1.get(0));
		//stringList_1.add(mergeStrings(stringList_1(0).getString() ,stringList_1(2).getString() ) );






		


		
	}
}