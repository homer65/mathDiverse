package m;

import m.impl.SimpleMatrix;

public class DiracMatrix extends SimpleMatrix
{
	public DiracMatrix(int n) 
	{
		super(4);
		if (n == 0)
		{
			this.setElement(0,0,new Komplex(1.0,0.0));
			this.setElement(0,1,new Komplex(0.0,0.0));
			this.setElement(0,2,new Komplex(0.0,0.0));
			this.setElement(0,3,new Komplex(0.0,0.0));
			this.setElement(1,0,new Komplex(0.0,0.0));
			this.setElement(1,1,new Komplex(1.0,0.0));
			this.setElement(1,2,new Komplex(0.0,0.0));
			this.setElement(1,3,new Komplex(0.0,0.0));
			this.setElement(2,0,new Komplex(0.0,0.0));
			this.setElement(2,1,new Komplex(0.0,0.0));
			this.setElement(2,2,new Komplex(-1.0,0.0));
			this.setElement(2,3,new Komplex(0.0,0.0));
			this.setElement(3,0,new Komplex(0.0,0.0));
			this.setElement(3,1,new Komplex(0.0,0.0));
			this.setElement(3,2,new Komplex(0.0,0.0));
			this.setElement(3,3,new Komplex(-1.0,0.0));
		}
		else if (n == 1)
		{
			this.setElement(0,0,new Komplex(0.0,0.0));
			this.setElement(0,1,new Komplex(0.0,0.0));
			this.setElement(0,2,new Komplex(0.0,0.0));
			this.setElement(0,3,new Komplex(1.0,0.0));
			this.setElement(1,0,new Komplex(0.0,0.0));
			this.setElement(1,1,new Komplex(0.0,0.0));
			this.setElement(1,2,new Komplex(1.0,0.0));
			this.setElement(1,3,new Komplex(0.0,0.0));
			this.setElement(2,0,new Komplex(0.0,0.0));
			this.setElement(2,1,new Komplex(-1.0,0.0));
			this.setElement(2,2,new Komplex(0.0,0.0));
			this.setElement(2,3,new Komplex(0.0,0.0));
			this.setElement(3,0,new Komplex(-1.0,0.0));
			this.setElement(3,1,new Komplex(0.0,0.0));
			this.setElement(3,2,new Komplex(0.0,0.0));
			this.setElement(3,3,new Komplex(0.0,0.0));
		}
		else if (n == 2)
		{
			this.setElement(0,0,new Komplex(0.0,0.0));
			this.setElement(0,1,new Komplex(0.0,0.0));
			this.setElement(0,2,new Komplex(0.0,0.0));
			this.setElement(0,3,new Komplex(0.0,-1.0));
			this.setElement(1,0,new Komplex(0.0,0.0));
			this.setElement(1,1,new Komplex(0.0,0.0));
			this.setElement(1,2,new Komplex(0.0,1.0));
			this.setElement(1,3,new Komplex(0.0,0.0));
			this.setElement(2,0,new Komplex(0.0,0.0));
			this.setElement(2,1,new Komplex(0.0,1.0));
			this.setElement(2,2,new Komplex(0.0,0.0));
			this.setElement(2,3,new Komplex(0.0,0.0));
			this.setElement(3,0,new Komplex(0.0,-1.0));
			this.setElement(3,1,new Komplex(0.0,0.0));
			this.setElement(3,2,new Komplex(0.0,0.0));
			this.setElement(3,3,new Komplex(0.0,0.0));
		}
		else if (n == 3)
		{
			this.setElement(0,0,new Komplex(0.0,0.0));
			this.setElement(0,1,new Komplex(0.0,0.0));
			this.setElement(0,2,new Komplex(1.0,0.0));
			this.setElement(0,3,new Komplex(0.0,0.0));
			this.setElement(1,0,new Komplex(0.0,0.0));
			this.setElement(1,1,new Komplex(0.0,0.0));
			this.setElement(1,2,new Komplex(0.0,0.0));
			this.setElement(1,3,new Komplex(-1.0,0.0));
			this.setElement(2,0,new Komplex(-1.0,0.0));
			this.setElement(2,1,new Komplex(0.0,0.0));
			this.setElement(2,2,new Komplex(0.0,0.0));
			this.setElement(2,3,new Komplex(0.0,0.0));
			this.setElement(3,0,new Komplex(0.0,0.0));
			this.setElement(3,1,new Komplex(1.0,0.0));
			this.setElement(3,2,new Komplex(0.0,0.0));
			this.setElement(3,3,new Komplex(0.0,0.0));
		}
		else
		{
			System.out.println("DiracMatrix::existiert nicht: " + n);
			System.exit(12);
		}
	}
}
