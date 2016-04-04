package kapil.defaultpackage;

public class singleInterface extends inheritedClass implements perimeterinterface{
	
	public static void main(String[] args)
	{
		
		
		singleInterface pro=new singleInterface();
	
	pro.setA(2);
	pro.setB(3);
	pro.setC(4);
	System.out.println(pro.perimeterOfTriangle());
	//System.out.println(pro.getSquarredSum());
	}
	
	public int perimeterOfTriangle()
	{
		return(getA()+getB()+getC());
		
		
		
	}
	
	
	

}
