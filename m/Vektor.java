package m;
public class Vektor 
{
	private int dim = 0;
	private Komplex v[] = null;
	public Vektor(int n)
	{
		dim = n;
		v = new Komplex[dim];
		for (int i=0;i<dim;i++)
		{
			v[i] = new Komplex();
		}
	}
	public Vektor(Vektor vektor)
	{
		dim = vektor.getDimension();
		v = new Komplex[dim];
		for (int i=0;i<dim;i++)
		{
			v[i] = new Komplex(vektor.getElement(i));
		}
	}
	public int getDimension()
	{
		return dim;
	}
	public Komplex getElement(int i)
	{
		return v[i];
	}
	public void setElement(int i,Komplex z)
	{
		v[i] = z;
	}
	public static Matrix xmult(Vektor v1,Vektor v2) // Äußeres Produkt
	{
		int n = v1.getDimension();
		Matrix erg = Controller.getMatrix(n);
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				Komplex zv1 = v1.getElement(i);
				Komplex zv2 = v2.getElement(j);
				zv2 = zv2.konjugiere();
				Komplex z = Komplex.mult(zv1,zv2);
				erg.setElement(i,j,z);
			}
		}
		return erg;
	}
	public static Vektor add(Vektor v1,Vektor v2)
	{
		int n = v1.getDimension();
		Vektor erg = new Vektor(n);
		for (int i=0;i<n;i++)
		{
			Komplex vz1 = v1.getElement(i);
			Komplex vz2 = v2.getElement(i);
			Komplex vz = Komplex.add(vz1,vz2);
			erg.setElement(i,vz);
		}
		return erg;
	}
	public static Vektor sub(Vektor v1,Vektor v2)
	{
		int n = v1.getDimension();
		Vektor erg = new Vektor(n);
		for (int i=0;i<n;i++)
		{
			Komplex vz1 = v1.getElement(i);
			Komplex vz2 = v2.getElement(i);
			Komplex vz = Komplex.sub(vz1,vz2);
			erg.setElement(i,vz);
		}
		return erg;
	}
	public static Komplex mult(Vektor v1,Vektor v2) // Inneres Produkt
	{
		Komplex erg = new Komplex();
		for (int i=0;i<v1.getDimension();i++)
		{
			Komplex z1 = v1.getElement(i);
			z1 = z1.konjugiere();
			Komplex z2 = v2.getElement(i);
			Komplex z = Komplex.mult(z1,z2);
			erg = Komplex.add(erg,z);
		}
		return erg;
	}
	public static Vektor mult(Komplex z,Vektor v)
	{
		int n = v.getDimension();
		Vektor erg = new Vektor(n);
		for (int i=0;i<n;i++)
		{
			Komplex zv = v.getElement(i);
			zv = Komplex.mult(z,zv);
			erg.setElement(i,zv);
		}
		return erg;
	}
	public double betragQuadrat()
	{
		double erg = 0.0;
		for (int i=0;i<dim;i++)
		{
			Komplex z = v[i];
			double x = z.betragQuadrat();
			erg += x;
		}
		return erg;
	}
	public double norm()
	{
		double erg = Math.sqrt(this.betragQuadrat());
		return erg;
	}
	public static Vektor getRandom(int dim)
	{
		Vektor erg = new Vektor(dim);
		for (int i=0;i<dim;i++)
		{
			Komplex z = Komplex.getRandom();
			erg.setElement(i,z);
		}
		return erg;
	}
	public String toString()
	{
		String erg = "";
		for (int i=0;i<dim;i++)
		{
			String s = v[i].toString();
			erg += s + "\n";
		}
		return erg;
	}
}
