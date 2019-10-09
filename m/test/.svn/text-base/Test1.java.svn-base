package m.test;
import m.*;
public class Test1 
{
	public static void main(String[] args) 
	{
		Integral integral = Controller.getIntegral();
		Funktion funktion = new Test1Funktion();
		integral.setAnzahlKnoten(1000000);
		double x = 4.0 * integral.get(funktion,0.0,1.0);
		System.out.println(x);
	}
}
