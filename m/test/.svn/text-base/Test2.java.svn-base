package m.test;
import m.*;
public class Test2 
{
	public static void main(String[] args) 
	{
		Nullstelle nullstelle = Controller.getNullstelle();
		Funktion funktion = new Test2Funktion();
		nullstelle.setAnzahlIterationen(10);
		nullstelle.setMinimum(0.00000000001);
		nullstelle.setStatistikAusgabe(true);
		double x = nullstelle.get(funktion,1.0,2.0);
		System.out.println(2 * x);
	}
}
