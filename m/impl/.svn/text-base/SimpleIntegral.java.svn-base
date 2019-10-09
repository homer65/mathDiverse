package m.impl;
import m.*;
public class SimpleIntegral implements Integral
{
	private int knoten = 100;
	@Override
	public double get(Funktion f, double x1, double x2)
	{
		double erg = 0;
		double dk = (double) knoten;
		double delta = (x2 -x1) / dk;
		double x = x1;
		for (int i=0;i<knoten;i++)
		{
			double f1 = f.get(x);
			x = x + delta;
			double f2 = f.get(x);
			erg = erg + 0.5 * (f1 + f2);
		}
		erg = erg * delta;
		return erg;
	}

	@Override
	public void setAnzahlKnoten(int i) 
	{
		knoten = i;		
	}
}
