package kapil.defaultpackage;

public class finalClass extends inheritedClass{
	
	
	public static void main(String[] args)
	{
		
		
		finalClass pro=new finalClass();
	
	pro.setA(2);
	pro.setB(3);
	pro.setC(4);
	System.out.println(pro.getsum());
	//System.out.println(pro.getSquarredSum());
	}
	public int getsum()
	{return(getA()+getB()+getC()+4);}
	
}
