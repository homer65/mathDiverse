package m;
public interface Integral 
{
	/*
	 * Berechnet das Integral über die Funktion f im  Interval von x1 bis x2
	 * Pi mal Daumen Regel: 
	 * Je höher die Anzahl Knoten, desto genauer das Ergebnis, und umso länger die Rechenzeit 
	 */
	public double get(Funktion f,double x1,double x2);
	public void setAnzahlKnoten(int i);
}
