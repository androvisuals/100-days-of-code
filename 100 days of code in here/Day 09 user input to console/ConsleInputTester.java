
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ConsoleInputTester {

	public static void main(String[] args) throws IOException 
	{
		
		boolean runProgram = true; 
		// Get BufferedReader for System.in.
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String line = null;
        
        System.out.println("type quit to exit the program");
        while (runProgram)
        {
        	System.out.println("Please type into the console");
        	// Read line from console.
            line = in.readLine();
            System.out.println("You typed " + line);
            
            if(line.equals("quit"))
            {
            	System.exit(0);
            }
        }
        
	}
	

}
