package m.impl;
import m.*;
public class PureDeterminante implements Determinante
{
	private Komplex erg = new Komplex(0.0,0.0);
	private Komplex minuseins = new Komplex(-1.0,0.0);
	private Matrix m = null;
	@Override
	public void setMatrix(Matrix m) 
	{
		this.m = m;
	}
	@Override
	public void setMaximaleIterationen(int n) 
	{
		// Hat hier keine Bedeutung
	}
	@Override
	public void setGenauigkeit(double d) 
	{
		// Hat hier keine Bedeutung	
	}
	@Override
	public void setStatistikAusgabe(boolean b) 
	{
		// Erstmal nicht	
	}
	@Override
	public void berechne() 
	{
		int n = m.getDimension();
		if (n == 1)
		{
			erg = m.getElement(0,0);
			return;
		}
		else
		{
			Komplex vorzeichen = minuseins;
			for (int i=0;i<n;i++)
			{
				vorzeichen = Komplex.mult(vorzeichen,minuseins);
				Komplex element = m.getElement(0,i);
				element = Komplex.mult(vorzeichen,element);
				Matrix submatrix = m.getSubMatrix(0,i);
				PureDeterminante pd = new PureDeterminante();
				pd.setMatrix(submatrix);
				pd.berechne();
				Komplex subdeterminante = pd.getDeterminante();
				erg = Komplex.add(erg,Komplex.mult(element,subdeterminante));
			}
		}
	}
	@Override
	public Komplex getDeterminante() 
	{
		return erg;
	}
}
