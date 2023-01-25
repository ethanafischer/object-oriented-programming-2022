package src;

import processing.core.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class drawPoints extends PApplet {

	public void settings() {
    size(500, 500);
	}
  
	public void setup() {
    	background(180);
    	noLoop();
  	}

  	public void draw() {

   	double x, y;
   
   	String[] lines = loadStrings("drawMe.txt");
   	println("there are " + lines.length);
  		for (int i=0; i < lines.length; i++){
      	if (lines[i].length() > 0 ) {
        		String[] words= lines[i].split(",");
        		x = Double.parseDouble(words[0]);
        		y = Double.parseDouble(words[1]);
        		println("xy: " + x + " " + y);
        		ellipse((int)x, (int)y, 1, 1);
      	}
  		}
  	}


  	public static void main(String args[]) {
		if (args.length != 1) {
			throw new IllegalArgumentException(
					"Expected exactly 1 argument: a file name.");
		}

		String filePath = "noise.txt";
		File positions = new File("noise.txt");
		Scanner sc = new Scanner(filePath);
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		PApplet.main("src.drawPoints");
   }
}
