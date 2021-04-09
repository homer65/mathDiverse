package m.test;
import m.*;
import m.impl.*;
public class Test13 
{
	public static void main(String[] args) 
	{
		Matrix p[] = new PauliMatrix[4];
		Matrix pp[] = new SimpleMatrix[16];
		for (int i=0;i<4;i++)
		{
			p[i] = new PauliMatrix(i);
			//System.out.println("++++++++++++++++++++++++++++++++++");
			//System.out.println(p[i]);
		}
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				pp[i*4+j] = p[i].kmult(p[j]);
				//System.out.println("----------------------------------------");
				//System.out.print(pp[i*4+j]);
			}
		}
		Matrix d[] = new DiracMatrix[4];
		for (int i=0;i<4;i++)
		{
			d[i] = new DiracMatrix(i);
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println(d[i]);
		}
	}
}
