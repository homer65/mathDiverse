package m.test;
import java.util.*;
import m.*;
public class Test9
{
	public static void main(String[] args) 
	{
		int n = 100;
		Matrix m = Controller.getMatrix(n);
		for (int i=0;i<n;i++)
		{
			double d = (double) i;
			Komplex z = new Komplex(d,0.0);
			m.setElement(i,i,z);
		}
		Eigenwert ew = Controller.getEigenwert();
		ew.setMatrix(m);
		ew.setGenauigkeit(0.0001);
		ew.setMaximaleIterationen(100000);
		ew.setStatistikAusgabe(false);
		Date jetzt = new Date();
		long vor = jetzt.getTime();
		ew.berechne();
		jetzt = new Date();
		long nach = jetzt.getTime();
		long laufzeit = nach - vor;
		System.out.println("Dauer in Millisekunden: " + laufzeit);
		for (int i=0;i<n;i++)
		{
			Komplex z = ew.getEigenwert(i);
			System.out.println(z.toString());
		}
	}
}
