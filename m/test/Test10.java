package m.test;
import m.*;
public class Test10
{
	public static void main(String[] args) 
	{
		Visualizer v = Controller.getVisualizer();
		Funktion funktion = new Test4Funktion();
		v.show(funktion,-0.0,10.0,1000);
	}
}
