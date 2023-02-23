package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(.05);
		StdDraw.rectangle(.5, .5, .5, .25);
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		double x[] = {0, 0.2, 0.1};
		double y[] = {0.25, 0.25, 0.45};
		StdDraw.filledPolygon(x, y);
		double a[] = {0.4, 0.6, 0.5};
		double b[] = {0.25, 0.25, 0.45};
		StdDraw.filledPolygon(a, b);
		double c[] = {0.2, 0.4, 0.3};
		double d[] = {0.25, 0.25, 0.45};
		StdDraw.filledPolygon(c, d);
		double e[] = {0.6, 0.8, 0.7};
		double f[] = {0.25, 0.25, 0.45};
		StdDraw.filledPolygon(e, f);
		double g[] = {0.8, 1, 0.9};
		double h[] = {0.25, 0.25, 0.45};
		StdDraw.filledPolygon(g, h);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.arc(0, .75, 0.15, 270, 0);
		StdDraw.arc(0, .75, 0.1, 270, 0);
		StdDraw.arc(0, .75, 0.05, 270, 0);
		
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.arc(1, .75, 0.15, 180, 270);
		StdDraw.arc(1, .75, 0.1, 180, 270);
		StdDraw.arc(1, .75, 0.05, 180, 270);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledEllipse(0.5, 0.6, 0.015, 0.03);
		StdDraw.setPenColor(StdDraw.ORANGE);
		double i [] = {0.49, 0.51, 0.5};
		double j [] = {0.62, 0.62, 0.65};
		StdDraw.filledPolygon (i, j);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(.5, .5, .5, .25);

	}
}