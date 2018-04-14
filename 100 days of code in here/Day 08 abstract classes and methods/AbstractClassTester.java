abstract class Animal
{
	String name;
	int age;
	public abstract void setName(String setName);
	public abstract String getName();
	
	public abstract void makeNoise();
	
}

class Canine extends Animal
{
	public void setName(String setname)
	{
		name = setname;
	}
	public String getName()
	{
		return name;
	}
	
	public void makeNoise() 
	{
		System.out.println("The " + getName() + " makes a noise");
	}
}

class Dog extends Canine
{
	
}
class Wolf extends Canine
{
	 public void makeNoise() //override method
	{
		System.out.println("The " + getName() + " howls at the moon");
	}
}

class AnimalList
{
	private int arraySize = 5;
	private Animal[] animals = new Animal[arraySize];
	private int nextIndex = 0;
	
	
	void setArraySize(int setArraySize)
	{
		arraySize = setArraySize;
	}
	int getArraySize()
	{
		return arraySize;
	}
	void add(Animal a)
	{
		if( nextIndex < getArraySize())
		{
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
		}
	}
	Animal getAnimal(int index)
	{
		return animals[index];
	}
	int getArrayLength()
	{
		return animals.length;
	}
	
	
}
public class AbstractClassTester {

	public static void main(String[] args) 
	{
		AnimalList list = new AnimalList();
		list.setArraySize(10);
		
		Dog a = new Dog();
		Wolf c = new Wolf();
		Animal d = new Wolf();
		list.add(a);
		list.add(c);
	
		System.out.println("Array list size is " + list.getArrayLength() );
		list.getAnimal(0).setName("Dog");
		list.getAnimal(0).makeNoise();
		
		list.getAnimal(1).setName("Wolf");
		list.getAnimal(1).makeNoise();
		
		d = list.getAnimal(0);
		list.add(d);
		list.getAnimal(2).setName("yo mama");
		list.getAnimal(2).makeNoise();
		
	}

}
