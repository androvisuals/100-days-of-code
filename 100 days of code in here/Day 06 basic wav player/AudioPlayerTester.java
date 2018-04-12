import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Mixer;


public class AudioPlayerTester 
{

	public static void main (String [] args)
	{
		//make sure your source files are in the correct location
		//replace string name with your file name
		String Kick = "KickLoop-01.wav";
		File kickSound = new File(Kick);
		
		String snare = "SnareLoop-01.wav";
		File snareSound = new File(snare);
		
		//play one sound after the other
		PlaySound(kickSound);
		PlaySound(snareSound);
		
	}
	
	static void PlaySound(File Sound)
	{
		try
		{
			
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}	
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
