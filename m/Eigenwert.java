package m;
public interface Eigenwert 
{
	/*
	 * Berechnet die Eigenwerte einer quadratischen Matrix
	 */
	public void setMatrix(Matrix m);
	public void setMaximaleIterationen(int n);
	public void setGenauigkeit(double d);
	public void setStatistikAusgabe(boolean b);
	public void berechne();
	public Komplex getEigenwert(int i);
	public Vektor getEigenVektor(int i);
}
