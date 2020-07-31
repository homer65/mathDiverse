package m.test;
import m.*;
public class sinus implements Funktion
{
	@Override
	public double get(double x) 
	{
		double erg = Math.sin(x);
		return erg;
	}
	@Override
	public String getName() 
	{
		return "Sinus";
	}
}
