package m.test;
import m.*;
public class lnZ implements Funktion
{
	private int N = 10000;
	private double dN = (double) N;
	@Override
	public double get(double beta) 
	{
		double erg = 0.0;
		for (int k=0;k<N;k++)
		{
			double dk = (double) k;
			double dx = Math.cos((2.0 * Math.PI * dk)/dN);
			dx = Math.exp((-1.0) *  beta * dx);
			dx = Math.log(1.0 + dx);
			erg += dx;
		}
		erg = erg / dN;
		return erg;
	}
	@Override
	public String getName() 
	{
		return "lnZ";
	}
}
