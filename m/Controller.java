package m;
import m.impl.*;
public class Controller 
{
	public static Integral getIntegral()
	{
		return new AdvancedIntegral();
	}
	public static Nullstelle getNullstelle()
	{
		return new SimpleNullstelle();
	}
	public static Eigenwert getEigenwert()
	{
		return new SimpleEigenwert();
	}
	public static InverseMatrix getInverseMatrix()
	{
		return new SimpleInverseMatrix();
	}
	public static Determinante getDeterminante()
	{
		//return new SimpleDeterminante();
		return new PureDeterminante();
	}
	public static Spur getSpur()
	{
		return new SimpleSpur();
	}
	public static Matrix getMatrix(int n)
	{
		return new SimpleMatrix(n);
	}
	public static Matrix getMatrix(Matrix matrix)
	{
		return new SimpleMatrix(matrix);
	}
	public static Visualizer getVisualizer()
	{
		return new JFreeChartVisualizer();
	}
}
