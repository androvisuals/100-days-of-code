import java.util.ArrayList;
import java.util.Random;
//generates an array list of words made from random characters.
//Seed system implemented for consistent output
class RandomWord
{
	String word = "";
	int index = 0;
	
	//builds a word by looping over the defined word length
	//i+ seed is actually i+(i from main loop in main) 
	void buildWord(String stringIn, int wordLength,int seed)
	{
		for(int i = 0; i < wordLength; i++)
		{
			//add seed to i for consistent random results
			word += getRandomLetter(stringIn,i+seed);	
		}
		
	}
	//generate a random number which gives the same output using a seed
	float randomGenerator(long seed) 
	{
	    Random generator = new Random();
	    generator.setSeed(seed*10001);
	    float num = generator.nextFloat() ;//* (0.5);

	    return num;
	}
	//get alphabet/numerical string in, generate a random number with a seed
	// lookup char per loop , return as string
	String getRandomLetter (String data, int seed)
	{
		int randomLookUp = (int) (randomGenerator(seed*100) * data.length());
		String aLetter= Character.toString(data.charAt( randomLookUp));
		return aLetter;
	}
	//get complete generated word
	String getWord()
	{
		return word;
	}
	//set index number
	void setIndex(int setInt)
	{
		index = setInt;
	}
	//get index number
	int getIndex()
	{
		return index;
	}

}


public class RandomStringTester
{
	public static void main(String [] args)
	{
		int seedAll = 1012834;//seed for all generated words
		int randomWordListSize = 10;//how many words to generate
		int randomWordSize = 50;//length of each word

		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


		ArrayList<RandomWord> randomWordList = new ArrayList<RandomWord>();
	
		
		for (int i = 0; i < randomWordListSize; i++)
		{
			//add new RandomWord object to arrayList per loop
			randomWordList.add(new RandomWord());
			//set index numbetr of RandomWord Object for index retrieval later on 
			randomWordList.get(i).setIndex(i);
			

			//builds a random word per loop
			//note that i+seedAll moves each word result up by one character
			//using i*seedAll fixes this problem and gives a unique result per loop
			randomWordList.get(i).buildWord(data,randomWordSize,i*seedAll);

			//uncomment to see index number per generated word
			System.out.println("index is " + randomWordList.get(i).getIndex());

			//prints generated word to the console
			System.out.println(randomWordList.get(i).getWord());
		}
		
	}
}