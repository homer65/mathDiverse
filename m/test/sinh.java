package m.test;
import m.*;
public class sinh implements Funktion
{
	@Override
	public double get(double x) 
	{
		double erg = Math.sinh(x);
		return erg;
	}
	@Override
	public String getName() 
	{
		return "sinh";
	}
}
