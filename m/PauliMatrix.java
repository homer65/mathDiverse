package m;

import m.impl.SimpleMatrix;

public class PauliMatrix extends SimpleMatrix
{
	public PauliMatrix(int n) 
	{
		super(2);
		if (n == 0)
		{
			this.setElement(0,0,new Komplex(1.0,0.0));
			this.setElement(0,1,new Komplex(0.0,0.0));
			this.setElement(1,0,new Komplex(0.0,0.0));
			this.setElement(1,1,new Komplex(1.0,0.0));
		}
		else if (n == 1)
		{
			this.setElement(0,0,new Komplex(0.0,0.0));
			this.setElement(0,1,new Komplex(1.0,0.0));
			this.setElement(1,0,new Komplex(1.0,0.0));
			this.setElement(1,1,new Komplex(0.0,0.0));
		}
		else if (n == 2)
		{
			this.setElement(0,0,new Komplex(0.0,0.0));
			this.setElement(0,1,new Komplex(0.0,-1.0));
			this.setElement(1,0,new Komplex(0.0,1.0));
			this.setElement(1,1,new Komplex(0.0,0.0));
		}
		else if (n == 3)
		{
			this.setElement(0,0,new Komplex(1.0,0.0));
			this.setElement(0,1,new Komplex(0.0,0.0));
			this.setElement(1,0,new Komplex(0.0,0.0));
			this.setElement(1,1,new Komplex(-1.0,0.0));
		}
		else
		{
			System.out.println("PauliMatrix::existiert nicht: " + n);
			System.exit(12);
		}
	}
}
