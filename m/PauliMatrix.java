package m;

import m.impl.SimpleMatrix;

public class PauliMatrix implements Matrix
{
	Matrix m = null;
	public PauliMatrix(int n) 
	{
		m = Controller.getMatrix(2);
		if (n == 0)
		{
			m.setElement(0,0,new Komplex(1.0,0.0));
			m.setElement(0,1,new Komplex(0.0,0.0));
			m.setElement(1,0,new Komplex(0.0,0.0));
			m.setElement(1,1,new Komplex(1.0,0.0));
		}
		else if (n == 1)
		{
			m.setElement(0,0,new Komplex(0.0,0.0));
			m.setElement(0,1,new Komplex(1.0,0.0));
			m.setElement(1,0,new Komplex(1.0,0.0));
			m.setElement(1,1,new Komplex(0.0,0.0));
		}
		else if (n == 2)
		{
			m.setElement(0,0,new Komplex(0.0,0.0));
			m.setElement(0,1,new Komplex(0.0,-1.0));
			m.setElement(1,0,new Komplex(0.0,1.0));
			m.setElement(1,1,new Komplex(0.0,0.0));
		}
		else if (n == 3)
		{
			m.setElement(0,0,new Komplex(1.0,0.0));
			m.setElement(0,1,new Komplex(0.0,0.0));
			m.setElement(1,0,new Komplex(0.0,0.0));
			m.setElement(1,1,new Komplex(-1.0,0.0));
		}
		else
		{
			System.out.println("PauliMatrix::existiert nicht: " + n);
			System.exit(12);
		}
	}

	@Override
	public int getDimension() 
	{
		return 2;
	}

	@Override
	public void setElement(int i, int j, Komplex z) 
	{
		// Nöh, geht nicht
		System.out.println("PauliMatrix:kann Element nicht setzen");
	}
	@Override
	public Komplex getElement(int i, int j) 
	{
		Komplex erg = m.getElement(i,j);
		return erg;
	}

	@Override
	public Vektor mult(Vektor v) 
	{
		Vektor erg = new Vektor(2);
		Komplex z00 = Komplex.mult(getElement(0,0),v.getElement(0));
		Komplex z01 = Komplex.mult(getElement(0,1),v.getElement(1));
		Komplex z0 = Komplex.add(z00,z01);
		Komplex z10 = Komplex.mult(getElement(1,0),v.getElement(0));
		Komplex z11 = Komplex.mult(getElement(1,1),v.getElement(1));
		Komplex z1 = Komplex.add(z10,z11);
		erg.setElement(0,z0);
		erg.setElement(1,z1);
		return erg;
	}

	@Override
	public Matrix getSubMatrix(int i, int j) 
	{
		Matrix erg = new SimpleMatrix(1);
			for (int i1=0;i1<1;i1++)
			{
				for (int j1=0;j1<1;j1++)
				{
					int i2 = i1;
					int j2 = j1;
					if (i1 >= i) i2++;
					if (j1 >= j) j2++;
					erg.setElement(i1,j1,getElement(i2,j2));
				}
			}
		return erg;
	}
}
