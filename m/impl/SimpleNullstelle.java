package m.impl;
import m.*;
public class SimpleNullstelle implements Nullstelle
{
	private int iterationen = 10000;
	private double minimum = 0.0000001;
	private boolean statistik = false;
	@Override
	public double get(Funktion f, double x1, double x2) 
	{
		double erg = 0.0;
		boolean vorzeitigesende = false;
		double f1 = f.get(x1);
		double f2 = f.get(x2);
		if ((f1 > 0.0 && f2 < 0.0) || (f1 < 0.0 && f2 > 0.0))
		{
			for (int i=0;i<iterationen;i++)
			{
				double x = (x1 + x2) / 2.0;
				double f3 = f.get(x);
				if (Math.abs(f3) < minimum) 
				{
					if (statistik)
					{
						System.out.println("SimpleNullstelle:Statistik:");
						System.out.println("Anzahl Iterationen: " + i);
						System.out.println("Funktionswert     : " + f3);
					}
					vorzeitigesende = true;
					break;
				}
				if ((f1 > 0.0 && f3 < 0.0) || (f1 < 0.0 && f3 > 0.0))
				{
					x2 = x;
					f2 = f3;
				}
				else
				{
					x1 = x;
					f1 = f3;
				}
			}
			if (!vorzeitigesende)
			{
				System.out.println("SimpleNullstelle:Statistik:");
				System.out.println("Anzahl Iterationen: " + iterationen);
				System.out.println("Funktionswert     : " + f.get((x1 + x2)/2.0));
			}
			erg = (x1 + x2) / 2.0;
		}
		else
		{
			System.out.println("SimpleNullstelle:Exception:");
			System.out.println("Funktionswerte an den Rändern haben gleiches Vorzeichen");
			System.out.println(x1 + " : " + f1);
			System.out.println(x2 + " : " + f2);
		}
		return erg;
	}
	@Override
	public void setAnzahlIterationen(int i)
	{
		iterationen = i;
	}
	@Override
	public void setMinimum(double d) 
	{
		minimum = d;		
	}
	@Override
	public void setStatistikAusgabe(boolean b) 
	{
		statistik = b;	
	}
}
