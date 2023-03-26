package engine.process;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Utility {
	
	public static Image readImage(String filePath) {
		try {
			return ImageIO.read(new File(filePath));
		}catch(IOException e) {
			System.err.println("Image doesn't exist");
			return null;
		}
	}
}
