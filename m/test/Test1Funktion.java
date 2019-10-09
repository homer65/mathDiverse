package m.test;
import m.*;
public class Test1Funktion implements Funktion
{
	@Override
	public double get(double x) 
	{
		double erg = Math.sqrt(2*x - x*x);
		return erg;
	}
	@Override
	public String getName() 
	{
		return "Kreisfunktion";
	}
}
