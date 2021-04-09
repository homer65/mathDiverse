package m.impl;
import m.*;
public class SimpleMatrix implements Matrix
{
	protected int dim = 0;
	protected Komplex[][] m = null;
	public SimpleMatrix(int n)
	{
		dim = n;
		m = new Komplex[dim][dim];
		for (int i=0;i<dim;i++)
		{
			for (int j=0;j<dim;j++)
			{
				m[i][j] = new Komplex();
			}
		}
	}
	public SimpleMatrix(Matrix matrix)
	{
		dim = matrix.getDimension();
		m = new Komplex[dim][dim];
		for (int i=0;i<dim;i++)
		{
			for (int j=0;j<dim;j++)
			{
				m[i][j] = new Komplex(matrix.getElement(i,j));
			}
		}
	}
	public int getDimension()
	{
		return dim;
	}
	public void setElement(int i,int j,Komplex z)
	{
		m[i][j] = z;
	}
	public Komplex getElement(int i,int j)
	{
		Komplex erg = m[i][j];
		return erg;
	}
	@Override
	public Komplex Spur()
	{
		Komplex erg = new Komplex(0.0,0.0);
		for (int i=0;i<dim;i++)
		{
			Komplex element = m[i][i];
			erg = Komplex.add(erg, element);
		}
		return erg;
	}
	@Override
	public Vektor mult(Vektor v) 
	{
		int n = dim;
		Vektor erg = new Vektor(n);
		for (int i=0;i<n;i++)
		{
			Komplex sum = new Komplex();
			for (int j=0;j<n;j++)
			{
				Komplex mz = m[i][j];
				Komplex vz = v.getElement(j);
				Komplex z = Komplex.mult(mz,vz);
				sum = Komplex.add(sum,z);
			}
			erg.setElement(i,sum);
		}
		return erg;
	}
	@Override 
	public Matrix mult(Matrix matrix)
	{
		int n = dim;
		Matrix erg = Controller.getMatrix(n);
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				Komplex summe = new Komplex(0.0,0.0);
				for (int k=0;k<n;k++)
				{
					Komplex element1 = m[i][k];
					Komplex element2 = matrix.getElement(k,j);
					Komplex produkt = Komplex.mult(element1,element2);
					summe = Komplex.add(summe,produkt);
				}
				erg.setElement(i,j,summe);
			}
		}
		return erg;
	}
	@Override
	public Matrix kmult(Matrix matrix)
	{
		int n1 = dim;
		int n2 = matrix.getDimension();
		int n = n1 * n2;
		Matrix erg = Controller.getMatrix(n);
		for (int i1=0;i1<n1;i1++)
		{
			for (int j1=0;j1<n2;j1++)
			{
				for (int i2=0;i2<n1;i2++)
				{
					for (int j2=0;j2<n2;j2++)
					{
						Komplex element1 = this.getElement(i1, i2);
						Komplex element2 = matrix.getElement(j1, j2);
						Komplex produkt = Komplex.mult(element1,element2);
						erg.setElement(i1*n2 +j1,i2*n2+j2,produkt);
					}
				}
			}
		}
		return erg;
	}
	@Override
	public Matrix getSubMatrix(int i, int j) 
	{
		Matrix erg = null;
		if (dim > 1)
		{
			erg = new SimpleMatrix(dim -1);
			for (int i1=0;i1<dim-1;i1++)
			{
				for (int j1=0;j1<dim-1;j1++)
				{
					int i2 = i1;
					int j2 = j1;
					if (i1 >= i) i2++;
					if (j1 >= j) j2++;
					erg.setElement(i1,j1,getElement(i2,j2));
				}
			}
		}
		return erg;
	}
	@Override
	public String toString()
	{
		String erg = "";
		for (int i=0;i<dim;i++)
		{
			for (int j=0;j<dim;j++)
			{
				erg = erg + " " + m[i][j].toString();
			}
			erg = erg + "\n";
		}
		return erg;
	}
}
