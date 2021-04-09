package m.test;
import m.*;
public class cosh implements Funktion
{
	@Override
	public double get(double x) 
	{
		double erg = Math.cosh(x) - 1.0;
		return erg;
	}
	@Override
	public String getName() 
	{
		return "cosh";
	}
}
