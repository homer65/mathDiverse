package m.test;
import m.*;
public class Test7
{
	public static void main(String[] args) 
	{
		for (int i=0;i<4;i++)
		{
			PauliMatrix pm = new PauliMatrix(i);
			System.out.println("---------------------------------------");
			System.out.println(MatrixUtil.toString(pm));
		}
	}
}
