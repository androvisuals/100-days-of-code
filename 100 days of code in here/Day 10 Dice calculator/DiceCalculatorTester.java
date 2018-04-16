
package daysOfCodePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//test code shooting phase
//request amount of shots in unit, number between 1 and 40, this is the amount of dice that get rolled.
//create an array of ints based upon size and generate random values


class DiceData
{
	int arraySize ;	//define amount of dice
	int [] dice;	//dice array
	int bs ;		//ballistic skill
	int toughness;	//toughness 
	
	Random random = new Random();//to generate random numbers
	
	//set amount of dice to roll
	void setArraySize(int setSize)
	{
		arraySize = setSize;
	}
	//create array of dice and random rolls
	void createDicePool()
	{
		dice = new int[arraySize];
		for(int i = 0;i < arraySize;i++)
		{
			dice[i] = random.nextInt(6)+1;//D6 1 to 6	
		}
	}
	//return dice array
	int [] getDicePool()
	{
		return dice;
	}
	
	//request ballistic skill of model, do for loop through array, each number >= is a hit, hit += 1
	void setBs(int setBs)
	{
		bs = setBs;
	}
	int getBs()
	{
		return bs;
	}
	int totalHits()
	{
		int totalHits=0;
		for(int i = 0; i < getDicePool().length; i++)
		{
			if (getDicePool()[i] >= bs)
			{
				totalHits +=1;
			}
		}
		return totalHits;
	}
	void setToughness(int setToughness)
	{
		toughness = setToughness;
	}
	int getToughness()
	{
		return toughness;
	}
	//request toughness of enemy unit. make new array based upon number of hits
	//test for wounds, keep track of wounds.
	int woundTotal( int TotalHits)
	{
		int totalWounds = 0 ;
		
		for(int i = 0; i <= TotalHits; i++)
		{
			int test = random.nextInt(6)+1;
			if(test >= getToughness())
			{
				totalWounds +=1;
			}
		}
		return totalWounds;
	}
	//request saving throw. get armor score, roll as many dice as wounds. keep track of saves
	//total kills = total wounds - total saves, still needs to be implemented
}








public class DiceCalculatorTester {

	public static void main(String[] args) throws IOException 
	{
		
		boolean runProgram = true; 
		// Get BufferedReader for System.in.
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String line = null;
        
        System.out.println("type quit to exit the program");
        
        //new dice data object
        DiceData diceData = new DiceData();
        //set amount of dice in pool
        diceData.setArraySize(10);
        //create the dice pool array
        diceData.createDicePool();
        
        //set ballistic skill
        diceData.setBs(5);
        System.out.println("ballistic skill is " + diceData.getBs() );
        //return total number of hits, hit = bs >= dice roll
        System.out.println("total hits = " + diceData.totalHits());
        //set toughness
        diceData.setToughness(3);
        //check how many hits >= toughness for total amount of wounds
        System.out.println("Toughness is " + diceData.getToughness() + " total wounds = " + diceData.woundTotal(diceData.totalHits()) );
        
        //print out all dice values
        for (int i = 0; i < diceData.getDicePool().length;i++ )
        {
        	System.out.print("dice " + (i+1) + " is " + diceData.getDicePool()[i] + " / ");
        }
        //program actual
        while (runProgram)
        {
        	System.out.println("");
        	System.out.println("how many dice should be rolled ? ");
        	
        	
            line = in.readLine();
            System.out.println("You typed " + line);
            
            if(line.equals("quit"))
            {
            	System.exit(0);
            }
        }
        
	}
	

}
