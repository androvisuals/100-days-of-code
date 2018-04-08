//basic study with class inheritance
class Addition
{
	int z= 0;

	int addition (int x, int y)
	{
		z = x+y;
		return z;
	}
}

class Subtract extends Addition
{
	int subtract (int x, int y)
	{
		z = x - y;
		return z;
	}
}

class Square extends Subtract
{
	int squareRoot (int x)
	{
		z = x * x;
		return z;
	}
}

class Division extends Square
{
	int divide (int x, int y)
	{
		z = x / y;
		return z;
	}
}

class UseAllTheThings extends Division
{
	int useAllTheThings(int a, int b,int c, int d)
	{
		//test that all inheritance works
		Division useItAll = new Division();

		a = useItAll.addition(10,15);
		b = useItAll.subtract(a,b);
		c = useItAll.squareRoot(b);
		d = useItAll.divide(a,c);
		z = a + b + c + d;
		return z;
	}


}

public class InheritanceTester
{
	public static void main (String [] args)
	{

		Addition addIt = new Addition();
		System.out.println("Addition test result is " + addIt.addition(10,15));

		Subtract subtractIt = new Subtract();
		System.out.println("Subtract test result is " +subtractIt.subtract(100,40));

		Square squareIt = new Square();
		System.out.println("SquareRoot test result is " +squareIt.squareRoot(3));

		Division divideIt = new Division();
		System.out.println("Divison test result is " +divideIt.divide(100,5));

		UseAllTheThings finaltester = new UseAllTheThings();
		System.out.println("Final inheritance test is " + finaltester.useAllTheThings(100,30,40,6) );



	}
}