package m;
/*
 * komplexe Zahl
 */
public class Komplex 
{
	private double re = 0.0;
	private double im = 0.0;
	public Komplex()
	{
		re = 0.0;
		im = 0.0;
	}
	public Komplex(double d)
	{
		re = d;
		im = 0.0;
	}
	public Komplex(double d1,double d2)
	{
		re = d1;
		im = d2;
	}
	public Komplex(Komplex z)
	{
		re = z.getRe();
		im = z.getIm();
	}
	public void setRe(double d)
	{
		re = d;
	}
	public void setIm(double d)
	{
		im = d;
	}
	public double getRe()
	{
		return re;
	}
	public double getIm()
	{
		return im;
	}
	public Komplex konjugiere()
	{
		Komplex erg = new Komplex();
		erg.setRe(re);
		erg.setIm(im * (-1.0));
		return erg;
	}
	public static Komplex add(Komplex z1,Komplex z2)
	{
		Komplex erg = new Komplex();
		erg.setRe(z1.getRe() + z2.getRe());
		erg.setIm(z1.getIm() + z2.getIm());
		return erg;
	}
	public static Komplex sub(Komplex z1,Komplex z2)
	{
		Komplex erg = new Komplex();
		erg.setRe(z1.getRe() - z2.getRe());
		erg.setIm(z1.getIm() - z2.getIm());
		return erg;
	}
	public static Komplex mult(Komplex z1,Komplex z2)
	{
		Komplex erg = new Komplex();
		erg.setRe(z1.getRe() * z2.getRe() - z1.getIm() * z2.getIm());
		erg.setIm(z1.getRe() * z2.getIm() + z1.getIm() * z2.getRe());
		return erg;
	}
	public static Komplex mult(double d,Komplex z)
	{
		Komplex erg = new Komplex();
		erg.setRe(d * z.getRe());
		erg.setIm(d * z.getIm());
		return erg;
	}
	public double betragQuadrat()
	{
		double erg = re * re + im * im;
		return erg;
	}
	public double norm()
	{
		double d = re * re + im * im;
		double erg = Math.sqrt(d);
		return erg;
	}
	public static Komplex div(Komplex z1,Komplex z2)
	{
		Komplex erg = new Komplex();
		double x = 1.0 / z2.betragQuadrat();
		Komplex z3 = z2.konjugiere();
		erg = Komplex.mult(z1,z3);
		erg = Komplex.mult(x,erg);
		return erg;
	}
	public static Komplex getRandom()
	{
		Komplex erg = new Komplex();
		erg.setRe(Math.random());
		erg.setIm(Math.random());
		return erg;
	}
	public String toString()
	{
		String erg = "(" + re + "," + im + ")";
		return erg;
	}
}
