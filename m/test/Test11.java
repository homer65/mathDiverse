package m.test;
import m.*;
public class Test11
{
	public static void main(String[] args) 
	{
		Visualizer visualizer = Controller.getVisualizer();
		double x1 = 0.0;
		double x2 = 2.0 * Math.PI;
		Funktion f = new sinus();
		Funktion g = new cosinus();
		visualizer.show(f, g, x1, x2, 1000);
	}
}
