//day 05
package daysOfCodePackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;

class FilePathHandler
{
	//used to get the relative path of this java file as a string
	String getRelativePath()
	{
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		return s;
	}
}

public class TextFileTester
{
	public static void main (String[]args)
	{
		
		String fileName = "TestTextFile.txt";
		try
		{
			//make a new file with the filename defined above
			File file = new File(fileName);
			//if file doesn't exist make a new file
			if (!file.exists())
			{
				file.createNewFile();
			}
			//make a new printwriter object
			PrintWriter pw = new PrintWriter(file);
			//fill text file with 50 lines of text
			for (int i = 0; i < 50; i++ )
			{
				pw.println("This is line " + i);
			}
			
			//close off the printwriter object
			pw.close();
			
			//print confirmation of process
			System.out.println("File process is complete");
			
			//use this to print out the location of the text file
			//no matter which system runs this code
			FilePathHandler filePath = new FilePathHandler();
			String relPath = filePath.getRelativePath();
			System.out.println("relative file location is  " + relPath );
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}