package m;
public interface Visualizer 
{
	/*
	 * Zeigt die Funktion im Intervall [x1,x2] grafisch an.
	 * anzahl ist die Anzahl der zu berechnenden Funktionswerte
	 */
	void show(Funktion f,double x1,double x2,int anzahl);
	/*
	 * Zeigt die Funktion f und g im Intervall [x1,x2] grafisch an.
	 * anzahl ist die Anzahl der zu berechnenden Funktionswerte
	 */
	void show(Funktion f,Funktion g,double x1,double x2,int anzahl);
}
