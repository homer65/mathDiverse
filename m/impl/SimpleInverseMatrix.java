package m.impl;
import m.*;
public class SimpleInverseMatrix implements InverseMatrix
{
	private double nullwert = 0.00001;
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
	public Matrix getInverse() 
	{
		Matrix erg = Controller.getMatrix(dim);
		for (int i=0;i<dim;i++)
		{
			Komplex ew = eigenwert.getEigenwert(i);
			if (ew.norm() < nullwert)
			{
				System.out.println("SimpleInverseMatrix:getInverse:Eigenwert Betrag kleiner nullwert: " + ew.norm());
			}
			Komplex faktor = Komplex.div(new Komplex(1.0,0.0),ew);
			Vektor ev = eigenwert.getEigenVektor(i);
			Matrix m1 = Vektor.xmult(ev,ev);
			Matrix m2 = MatrixUtil.mult(faktor,m1);
			erg = MatrixUtil.add(erg,m2);
		}
		return erg;
	}
	@Override
	public void setNull(double d) 
	{
		nullwert = d;	
	}
}
