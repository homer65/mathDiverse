package m.impl;
import m.*;
public class SimpleSpur implements Spur
{
	private Matrix m;
	private Komplex erg = new Komplex(0.0,0.0);
	@Override
	public void setMatrix(Matrix m) 
	{
		this.m = m;
		erg = new Komplex(0.0,0.0);
	}
	@Override
	public void berechne() 
	{
		int d = m.getDimension();
		for (int i=0;i<d;i++)
		{
			Komplex element = m.getElement(i,i);
			erg = Komplex.add(erg,element);
		}
	}
	@Override
	public Komplex getSpur() 
	{
		return erg;
	}
}
