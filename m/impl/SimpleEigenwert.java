package m.impl;
import m.*;
public class SimpleEigenwert implements Eigenwert
{
	private int maxiter = 10000;
	private double genauigkeit = 0.0001;
	private boolean statistik = false;
	private int dim = 0;
	private Matrix m = null;
	private Komplex mnorm = null;
	private Komplex[] ew = null;
	private Vektor[] ev = null;
	@Override
	public void setMatrix(Matrix matrix) 
	{
		m = matrix;
		dim = matrix.getDimension();
		mnorm = new Komplex(MatrixUtil.norm(m));
		for (int i=0;i<dim;i++)
		{
			Komplex z = m.getElement(i,i);
			z = Komplex.sub(z,mnorm);
			m.setElement(i,i,z);
		}
		ew = new Komplex[dim];
		for (int i=0;i<dim;i++)
		{
			ew[i] = new Komplex();
		}
		ev = new Vektor[dim];
		for (int i=0;i<dim;i++)
		{
			ev[i] = new Vektor(dim);
		}
	}
	@Override
	public void setMaximaleIterationen(int n) 
	{
		maxiter = n;		
	}
	@Override
	public void berechne() 
	{
		int anzahlIterationenMaximum = 0;
		int anzahlIterationenGesamt = 0;
		for (int i=0;i<dim;i++)
		{
			ev[i] = Vektor.getRandom(dim);
			boolean vorzeitigesende = false;
			int anzahlIterationen = 0;
			for (int j=0;j<maxiter;j++)
			{
				anzahlIterationen++;
				Vektor v = m.mult(ev[i]);
				double faktor = (-1.0) / v.norm();
				v = Vektor.mult(new Komplex(faktor),v);
				Vektor vd = Vektor.sub(v,ev[i]);
				double delta = vd.norm();
				ev[i] = new Vektor(v);
				if (delta < genauigkeit)
				{
					vorzeitigesende = true;
					if (statistik)
					{
						anzahlIterationenGesamt += (j + 1);
						if (j+1>anzahlIterationenMaximum) 
						{
							anzahlIterationenMaximum = j+1;
						}
						// System.out.println("Anzahl Iterationen: " + (j+1));
					}
					break;
				}
			}
			System.out.println("Anzahl Iteratioen " + anzahlIterationen);
			if (statistik)
			{
				if (!vorzeitigesende)
				{
					anzahlIterationenGesamt += maxiter;
					System.out.println("Anzahl Iterationen Maximum erreicht: " + maxiter);
				}
			}
			Vektor v = m.mult(ev[i]);
			ew[i] = getEigenwert(v,ev[i]);
			Matrix em = Vektor.xmult(ev[i],ev[i]);
			em = MatrixUtil.mult(ew[i],em);
			m = MatrixUtil.sub(m,em);
		}
		if (statistik)
		{
			System.out.println("Maximale Anzahl Iterationen: " + anzahlIterationenMaximum);
			System.out.println("Gesamtzahl der Iterationen : " + anzahlIterationenGesamt);
		}
	}
	private Komplex getEigenwert(Vektor v,Vektor w)
	{
		int n = v.getDimension();
		double max = 0.0;
		int maxi = 0;
		for (int i=0;i<n;i++)
		{
			Komplex vz = v.getElement(i);
			double vd = vz.betragQuadrat();
			if (vd > max)
			{
				max = vd;
				maxi = i;
			}
		}
		Komplex vz = v.getElement(maxi);
		Komplex wz = w.getElement(maxi);
		Komplex erg = Komplex.div(vz,wz);
		return erg;
	}
	@Override
	public Komplex getEigenwert(int i) 
	{
		Komplex erg = Komplex.add(ew[i],mnorm);
		return erg;
	}
	@Override
	public Vektor getEigenVektor(int i) 
	{
		return ev[i];
	}
	@Override
	public void setGenauigkeit(double d) 
	{
		genauigkeit = d;		
	}
	@Override
	public void setStatistikAusgabe(boolean b) 
	{
		statistik = b;		
	}
}
