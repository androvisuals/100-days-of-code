import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

//test code shooting phase
//request amount of shots in unit, number between 1 and 40, this is the amount of dice that get rolled.
//create an array of ints based upon size and generate random values


class DiceData
{
	int arraySize ;	//define amount of dice
	int [] dice;	//dice array
	int bs ;		//ballistic skill
	int toughness;	//toughness 
	int totalWounds;
	int armor;
	int totalKills;
	
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
	void setTotalWounds(int setTotalWounds)
	{
		totalWounds =  setTotalWounds;
	}
	int getTotalWounds()
	{
		return totalWounds;
	}
	//request toughness of enemy unit. make new array based upon number of hits
	//test for wounds, keep track of wounds.
	void woundTotal( int TotalHits)
	{
//		int totalWounds = 0 ;
		int tempWounds = 0;
		for(int i = 0; i <= TotalHits; i++)
		{
			int test = random.nextInt(6)+1;
			if(test >= getToughness())
			{
				tempWounds +=1;
			}
		}
		setTotalWounds(tempWounds);
		
		//return totalWounds;
	}
	void setArmor(int setArmor)
	{
		armor = setArmor;
	}
	int getArmor()
	{
		return armor;
	}
	void savingThrow()
	{
//		int totalKills = 0;
		for (int i = 0; i < totalWounds;i++)
		{
			int test = random.nextInt(6)+1;
			if(test >= getArmor())
			{
				totalKills +=1;
			}
		}
	}
	int getTotalKills()
	{
		return totalKills;
	}
	//request saving throw. get armor score, roll as many dice as wounds. keep track of saves
	//total kills = total wounds - total saves, still needs to be implemented
}


public class DiceCalculatorTester 
{

	public static void main(String[] args) throws IOException 
	{
		
		boolean runProgram = true; 
		// Get BufferedReader for System.in.
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String userInput = null;
        Scanner userInput2 = new Scanner(System.in);
        int numIn = 0;
        
        System.out.println("type quit to exit the program");
        
        //new dice data object
        DiceData diceData = new DiceData();
       
        //program actual
        while (runProgram)
        {
        	System.out.println("");
        	System.out.println("how many dice should be rolled ? ");
        	//userInput is a string from console input
        	while (true)
        	{
        		//userInput = in.readLine();
        		//numIn = userInput2.nextInt();
        		//System.out.println(numIn);
        		//userInput2.hasNext();
        		if(!userInput2.hasNextInt())//if input is not an int loop again
        		{
        			System.out.println("Input was not a number please try again");
        			continue;
        		}
        		
    			break;
        		
        	}

	        diceData.setArraySize(numIn);
	        diceData.createDicePool();
        
        	
        	System.out.println("Set ballistic skill 1-6 ");
            userInput = in.readLine();
            diceData.setBs(Integer.parseInt(userInput));
            System.out.println("ballistic skill is " + diceData.getBs() );
            
            System.out.println("total hits = " + diceData.totalHits());
            
            System.out.println("what is the toughness of the target unit 1- 6 ? " );
            userInput = in.readLine();
            diceData.setToughness(Integer.parseInt(userInput));
            diceData.woundTotal(diceData.totalHits());
            System.out.println("total wounds = " + diceData.getTotalWounds());
            
            System.out.println("What is the armor save of the unit ? 1-6");
            userInput = in.readLine();
            diceData.setArmor(Integer.parseInt(userInput));
            diceData.savingThrow();
            System.out.println("Total units destroyed = " + diceData.getTotalKills());
            
            //debug dice pool          
//            for (int i = 0; i < diceData.getDicePool().length;i++ )
//            {
//            	System.out.println("");
//            	System.out.print("dice " + (i+1) + " is " + diceData.getDicePool()[i] + " / ");
//            }
            System.out.println("Would you like to roll again - yes or no");
            
            userInput = in.readLine();
            if(userInput.equals("no"))
            {
            	System.out.println("Exiting program");
            	runProgram = false;
            }

        }
        
	}
	

}
