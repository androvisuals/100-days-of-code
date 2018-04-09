import java.util.ArrayList;
import java.util.Random;
//generates an array list of words made from random characters.
//still have to implement a seed system for consistent results.
class RandomWord
{
	String word = "";
	
	void buildWord(String stringIn, int wordLength)
	{
		for(int i = 0; i < wordLength; i++)
		{
			word += getRandomLetter(stringIn,i);	
		}
		
	}

	// int randomGenerator () 
	// {
	// 	double randomGenerator(long seed) {
	//     Random generator = new Random(seed);
	//     float num = generator.nextFloat() ;

	//     return num;
	// }

	String getRandomLetter (String data, int seed)
	{
		int randomLookUp = (int) (Math.random()* data.length());
		//System.out.println("Random number is " + randomLookUp);
		String aLetter= Character.toString(data.charAt( randomLookUp));
		return aLetter;
	}

	String getWord()
	{
		return word;
	}

}


public class RandomStringTester
{
	public static void main(String [] args)
	{
		int randomWordListSize = 20;//how many words to generate
		int randomWordSize = 10;//length of each word

		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		RandomWord generateWord = new RandomWord();
		generateWord.buildWord(data,randomWordListSize);

		ArrayList<RandomWord> randomWordList = new ArrayList<RandomWord>();
	
		
		for (int i = 0; i < randomWordListSize; i++)
		{
			String indexName = "rw"+i;
			
			randomWordList.add(new RandomWord());
			randomWordList.get(i).buildWord(data,randomWordSize);
			System.out.println(randomWordList.get(i).getWord());
		}
		
	}
}