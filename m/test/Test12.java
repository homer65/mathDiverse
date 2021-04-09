package m.test;
import m.*;
public class Test12
{
	public static void main(String[] args) 
	{
		Visualizer visualizer = Controller.getVisualizer();
		double x1 = 0.0;
		double x2 = 1.0;
		Funktion f = new lnZ();
		Funktion g = new lnZ0();
		//Funktion f = new sinh();
		//Funktion g = new cosh();
		visualizer.show(f,g, x1, x2, 1000);
	}
}
