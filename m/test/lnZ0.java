package m.test;
import m.*;
public class lnZ0 implements Funktion
{
	private int N = 100;
	private double dN = (double) N;
	@Override
	public double get(double beta) 
	{
		double erg = 0.0;
		double c = Math.cosh(beta) - 1.0;
		double s = Math.sinh(beta);
		double w = Math.sqrt(0.25 + c);
		double argln1 = 0.5 + w;
		double argln2 = 0.5 - w;
		double x1 = 1.0;
		double x2 = 1.0;
		for (int i=0;i<2*N;i++)
		{
			x1 = x1 * argln1;
			x2 = x2 * argln2;
		}
		double x3 = 1.0;
		for (int i=0;i<N;i++)
		{
			x3 = x3 * s;
		}
		double argln = x1 + x2 + 2.0 * x3;
		erg = Math.log(2) + Math.log(argln) / dN;
		return erg;
	}
	@Override
	public String getName() 
	{
		return "lnZ0";
	}
}
