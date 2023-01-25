import processing.core.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class drawPoints extends PApplet {

	public void settings() {
    size(500, 500);
	}
  
	public void setup() {
    	background(180);
    	noLoop();
  	}

  	public void draw() {
		double x, y, z;

		String[] lines = loadStrings("drawMe.txt");
		List<Point> linesPoint = new ArrayList<>();
		for(String line: lines){
			String[] words = line.split(",");
			x = Double.parseDouble(words[0]);
			y = Double.parseDouble(words[1]);
			z = Double.parseDouble(words[2]);
			linesPoint.add(new Point(x, y, z));
		}
		List<Point> filterPoints = linesPoint.stream()
				.filter(p -> p.z <= 2.0)
				.map(p -> new Point(
						(p.x * 0.5) - 150,
						(p.y * 0.5) - 37,
						p.z * 0.5))
				.collect(Collectors.toList());

		println("there are " + lines.length);
		for (Point p: filterPoints) {
			println("xyz: " + p.x + " " + p.y + " " + p.z);
			ellipse((int) p.x, (int) p.y, 1, 1);

		}
  	}

  	public static void main(String args[]) {
		PApplet.main("drawPoints");
   }
}
