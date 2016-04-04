package kapil.defaultpackage;

public class abstractClass extends inheritedClass {
	
	

	public static void main(String[] args)
	{
		
		
		abstractClass pro=new abstractClass();
	
	pro.setA(2);
	pro.setB(3);
	pro.setC(4);
	System.out.println(pro.getsum());
	//System.out.println(pro.getSquarredSum());
	}
	
	public int getsum()
	{return(getA()+getB()+getC());}
	

}
