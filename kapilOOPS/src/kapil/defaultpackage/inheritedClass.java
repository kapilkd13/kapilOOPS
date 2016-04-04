package kapil.defaultpackage;

public  abstract class inheritedClass {
	
	
	
	private int a,b,c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	//for abstact class  
	//public abstract int getsum();
	/*
	public final  int getsum()
	{
		
		return (a+b+c);
	}

}
*/
	public int getsum()
	{
		
		return (a+b+c);
	}

}
