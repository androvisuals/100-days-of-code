import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

import java.util.Arrays;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ImageScramblerTester {

	public static void main(String[] args) {

		try {

			//create array of bytes
			byte[] imageInByte;
			//use buffered image and imageIO to read a image from disk
			//change the string to load a different image
			BufferedImage originalImage = ImageIO.read(new File(
					"small-test-pattern-2.jpg"));

			// convert BufferedImage to byte array
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			//write image to stream
			//attempt to shuffle array
			Collections.shuffle(Arrays.asList(baos));
		
			
			//byte[] arrayShuffle = 
			ImageIO.write(originalImage, "jpg", baos);
			baos.flush();
			//byte array
			imageInByte = baos.toByteArray();
			
			
			//System.out.println(imageInByte.);
			baos.close();

			// convert byte array back to BufferedImage
			InputStream in = new ByteArrayInputStream(imageInByte);
			BufferedImage bImageFromConvert = ImageIO.read(in);

			//define file name to write the new image to thats made form the 
			//byte array.
			ImageIO.write(bImageFromConvert, "jpg", new File(
					"small-test-pattern-2-convert.jpg"));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}