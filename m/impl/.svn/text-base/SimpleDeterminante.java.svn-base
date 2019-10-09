package m.impl;
import m.*;
public class SimpleDeterminante implements Determinante
{
	private int dim = 0;
	private Eigenwert eigenwert = Controller.getEigenwert();
	@Override
	public void setMatrix(Matrix m) 
	{
		dim = m.getDimension();
		eigenwert.setMatrix(m);
	}
	@Override
	public void setMaximaleIterationen(int n) 
	{
		eigenwert.setMaximaleIterationen(n);
	}
	@Override
	public void setGenauigkeit(double d) 
	{
		eigenwert.setGenauigkeit(d);		
	}
	@Override
	public void setStatistikAusgabe(boolean b) 
	{
		eigenwert.setStatistikAusgabe(b);		
	}
	@Override
	public void berechne() 
	{
		eigenwert.berechne();		
	}
	@Override
	public Komplex getDeterminante() 
	{
		Komplex erg = new Komplex(1.0,0.0);
		for (int i=0;i<dim;i++)
		{
			Komplex ew = eigenwert.getEigenwert(i);
			erg = Komplex.mult(erg,ew);
		}
		return erg;
	}
}
