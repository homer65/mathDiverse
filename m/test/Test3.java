package m.test;
import m.*;
public class Test3
{
	public static void main(String[] args) 
	{
		Komplex z = new Komplex();
		System.out.println(z.toString());
		Komplex z1 = new Komplex(1.0,1.0);
		z = Komplex.mult(z1,z1);
		System.out.println(z.toString());
		Komplex z2 = new Komplex(3.0,5.0);
		z = Komplex.mult(z1,z2);
		System.out.println(z);
		z = z.konjugiere();
		System.out.println(z);
		z = Komplex.div(z,z);
		System.out.println(z.toString());
	}
}
