package kapil.defaultpackage;

public class funcoverride extends inheritedClass {

	public static void main(String[] args)
	{
		
		
	funcoverride pro=new funcoverride();
	
	pro.setA(2);
	pro.setB(3);
	pro.setC(4);
	System.out.println(pro.getsum());
	}
	
	public int getsum()
	{
		return (this.getA()+this.getB()+10);
		
	}
	
	
}
