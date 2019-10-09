package m.test;
import m.*;
public class Test4
{
	public static void main(String[] args) 
	{
		Matrix m = Controller.getMatrix(3);
		m.setElement(0,0,new Komplex(1.0,0.0));
		m.setElement(0,1,new Komplex(2.0,0.0));
		m.setElement(0,2,new Komplex(0.0,0.0));
		m.setElement(1,0,new Komplex(2.0,0.0));
		m.setElement(1,1,new Komplex(2.0,0.0));
		m.setElement(1,2,new Komplex(0.0,0.0));
		m.setElement(2,0,new Komplex(0.0,0.0));
		m.setElement(2,1,new Komplex(0.0,0.0));
		m.setElement(2,2,new Komplex(3.0,0.0));
		Eigenwert ew = Controller.getEigenwert();
		ew.setMatrix(m);
		//ew.setMaximaleIterationen(1000);
		ew.setGenauigkeit(0.000000001);
		ew.setStatistikAusgabe(true);
		ew.berechne();
		for (int i=0;i<3;i++)
		{
			Komplex z = ew.getEigenwert(i);
			System.out.println(z.toString());
		}
	}
}
