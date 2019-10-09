package m.test;
import m.*;
public class Test6
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
		Determinante det = Controller.getDeterminante();
		det.setMatrix(m);
		det.setGenauigkeit(0.000000001);
		det.setStatistikAusgabe(true);
		det.berechne();
		Komplex z = det.getDeterminante();
		System.out.println(z);
	}
}
