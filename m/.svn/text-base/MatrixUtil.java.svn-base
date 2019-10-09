package m;
/*
 * Diverse Matrix Operationen
 */
public class MatrixUtil 
{
	public static Komplex Spur(Matrix matrix)
	{
		Komplex erg = new Komplex();
		for (int i=0;i<matrix.getDimension();i++)
		{
			erg = Komplex.add(erg,matrix.getElement(i,i));
		}
		return erg;
	}
	public static double norm(Matrix matrix)
	{
		int dim = matrix.getDimension();
		double erg = 0.0;
		for (int i=0;i<dim;i++)
		{
			for (int j=0;j<dim;j++)
			{
				Komplex z = matrix.getElement(i,j);
				double bq = z.betragQuadrat();
				erg += bq;
			}
		}
		erg = Math.sqrt(erg);
		return erg;
	}
	public static Matrix add(Matrix m1,Matrix m2)
	{
		int n = m1.getDimension();
		Matrix erg = Controller.getMatrix(n);
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				Komplex z1 = m1.getElement(i,j);
				Komplex z2 = m2.getElement(i,j);
				Komplex z = Komplex.add(z1,z2);
				erg.setElement(i,j,z);
			}
		}
		return erg;
	}
	public static Matrix sub(Matrix m1,Matrix m2)
	{
		int n = m1.getDimension();
		Matrix erg = Controller.getMatrix(n);
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				Komplex z1 = m1.getElement(i,j);
				Komplex z2 = m2.getElement(i,j);
				Komplex z = Komplex.sub(z1,z2);
				erg.setElement(i,j,z);
			}
		}
		return erg;
	}
	public static Matrix kmult(Matrix m1,Matrix m2) // Kronecker Produkt
	{
		int n1 = m1.getDimension();
		int n2 = m2.getDimension();
		int n = n1 * n2;
		Matrix erg = Controller.getMatrix(n);
		for (int i=0;i<n1;i++)
		{
			for (int j=0;j<n1;j++)
			{
				for (int k=0;k<n2;k++)
				{
					for (int l=0;l<n2;l++)
					{
						int x = i * n2 + k;
						int y = j * n2 + l;
						Komplex z1 = m1.getElement(i,j);
						Komplex z2 = m2.getElement(k,l);
						Komplex z = Komplex.mult(z1,z2);
						erg.setElement(x,y,z);
					}
				}
			}
		}
		return erg;
	}
	public static Matrix mult(Matrix m1,Matrix m2)
	{
		int n = m1.getDimension();
		Matrix erg = Controller.getMatrix(n);
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				Komplex mz = new Komplex();
				for (int k=0;k<n;k++)
				{
					Komplex z1 = m1.getElement(i,k);
					Komplex z2 = m2.getElement(k,j);
					Komplex z = Komplex.mult(z1,z2);
					mz = Komplex.add(mz,z);
				}
				erg.setElement(i,j,mz);
			}
		}
		return erg;
	}
	public static Matrix mult(Komplex z,Matrix m)
	{
		int n = m.getDimension();
		Matrix erg = Controller.getMatrix(n);
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				Komplex mz = Komplex.mult(z,m.getElement(i,j));
				erg.setElement(i,j,mz);
			}
		}
		return erg;
	}
	public static Matrix getPauli(int[] x) //Kronecker Produkt von Pauli Matrizrn kurz Pauli
	{
		int dim = 1;
		for (int i=0;i<x.length;i++)
		{
			dim = 2 * dim;
		}
		Matrix m = Controller.getMatrix(dim);
		Matrix temp = new PauliMatrix(x[0]);
		for (int i=1;i<x.length;i++)
		{
			temp = MatrixUtil.kmult(temp,new PauliMatrix(x[i]));
		}
		for (int i=0;i<dim;i++)
		{
			for (int j=0;j<dim;j++)
			{
				m.setElement(i,j,temp.getElement(i,j));
			}
		}
		return m;
	}
	public static String toString(Matrix matrix)
	{
		int dim = matrix.getDimension();
		String erg = "";
		for (int i=0;i<dim;i++)
		{
			for (int j=0;j<dim;j++)
			{
				Komplex z = matrix.getElement(i,j);
				erg += z.toString();
			}
			erg += "\n";
		}
		return erg;
	}
}
