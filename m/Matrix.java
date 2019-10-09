package m;
public interface Matrix 
{
	public int getDimension();
	public void setElement(int i,int j,Komplex z);
	public Komplex getElement(int i,int j);
	public Vektor mult(Vektor v);
	public Matrix getSubMatrix(int i,int j); //Matrix ohne i-te Zeile und j-te Spalte 
}
