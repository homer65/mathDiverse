package m.test;
import m.*;
public class Test3Funktion implements Funktion
{
	@Override
	public double get(double x) 
	{
		double mx = (-1.0) * x;
		double e = Math.exp(mx);
		double erg = 1.0 / (1.0 + e);
		return erg;
	}
	@Override
	public String getName() 
	{
		return "Sigmoid";
	}
}
