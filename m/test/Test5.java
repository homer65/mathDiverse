package m.test;
import m.*;
public class Test5
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
		InverseMatrix im = Controller.getInverseMatrix();
		im.setMatrix(m);
		//ew.setMaximaleIterationen(1000);
		im.setGenauigkeit(0.000000001);
		im.setStatistikAusgabe(true);
		im.berechne();
		Matrix i = im.getInverse();
		Matrix eins = MatrixUtil.mult(i,m);
		for (int k=0;k<3;k++)
		{
			for (int l=0;l<3;l++)
			{
				Komplex z = eins.getElement(k,l);
				System.out.println(k + ":" + l + ":" + z.toString());
			}
		}
	}
}
