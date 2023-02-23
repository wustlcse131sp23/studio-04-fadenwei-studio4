package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble(); 
		
		StdDraw.setPenColor(r, g, b);
		
		if (shape.equals("triangle"))
		{
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double [] xCoordinates = {x, halfWidth, x3};
		double [] yCoordinates = {y, halfHeight, y3};
			if (filled)
			{
			StdDraw.filledPolygon(xCoordinates, yCoordinates);
			}
			else
			{
			StdDraw.polygon(xCoordinates, yCoordinates); 
			}
		}
		
		else if (shape.equals("ellipse"))
			{
			StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
		else
		{
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
		}
		
	 
	}
}
