//Studies using the ArrayList object
import java.util.ArrayList;
import java.util.Collections;

//MathTester class is used to study putting objects 
//into a list array and calling methods upon them
//Arraylist with objects is more powerful than standard 
//arrays as the list can be altered in size.
class MathTester
{
	private int result = 10;

	int getResult()
	{

		return result;
	}
	void setResult(int set)
	{
		result = set;
	}

	int addition(int x, int y )
	{
		result = x+y;

		return result;
	}
}

public class ArrayListTester
{
	public static void main (String[] args)
	{
		//used for all ArrayList tests
		int arrayLength = 5;
		//ArrayList with integer, int cannot be used as it is not a class
		ArrayList<Integer> integerList_1 = new ArrayList<Integer>(arrayLength);
		for (int i=0; i<arrayLength; i++)
		{
			integerList_1.add(i*2);
		}
		System.out.println("Values of integerList_1 are " + integerList_1);

		//Another way to add the values in one go using collections
		ArrayList<Integer> integerList_2 = new ArrayList<Integer>();
		Collections.addAll(integerList_2, 10,20,30,40,50);
		
		System.out.println("Values of integerList_2 are " + integerList_2);

		//Create a new arraylist by copying another
		ArrayList<Integer> integerList_3 = new ArrayList<>(integerList_2);
		System.out.println("Values of integerList_3 are " + integerList_3);
		
		//insert a new value into the array
		integerList_3.add(3,1000);
		System.out.println("Values of integerList_3 are " + integerList_3);

		//ArrayLists with strings
		ArrayList<String> stringList_1 = new ArrayList<String>(); 
		Collections.addAll(stringList_1,"Alpha","Bravo","Charlie","Delta");
		System.out.println("Values of stringList_1 are "  + stringList_1);

		//returns the index number of a match
		int index_0 = stringList_1.indexOf("Charlie");
		System.out.println("String was found at index " + index_0);
		index_0 = stringList_1.indexOf("Foxtrot");
		System.out.println("String was found at index " + index_0);


		ArrayList<MathTester> mTester = new ArrayList<MathTester>();
		MathTester unit0 = new MathTester();
		MathTester unit1 = new MathTester();
		mTester.add(unit0);
		mTester.add(unit1);
		mTester.get(0).addition(10,15);
		mTester.get(1).addition(100,15);
		int mtesterIndex = 0;
		for (MathTester value : mTester)
		{
			System.out.println("Result of mtester method " + mtesterIndex + " is  " + mTester.get(mtesterIndex++).getResult() );
		}


		
	}
}