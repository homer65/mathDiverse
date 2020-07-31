package m.test;
import m.*;
public class cosinus implements Funktion
{
	@Override
	public double get(double x) 
	{
		double erg = Math.cos(x);
		return erg;
	}
	@Override
	public String getName() 
	{
		return "Cosinus";
	}
}
