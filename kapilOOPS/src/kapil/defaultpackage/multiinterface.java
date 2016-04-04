package kapil.defaultpackage;

public class multiinterface extends inheritedClass implements areainterface, perimeterinterface {
	
	public static void main(String[] args)
	{
		
		
		multiinterface pro=new multiinterface();
	
	pro.setA(2);
	pro.setB(3);
	pro.setC(4);
	System.out.println(pro.perimeterOfTriangle());
	System.out.println(pro.areaOfTriangle());
	//System.out.println(pro.getSquarredSum());
	}
	
	public int perimeterOfTriangle()
	{
		return(getA()+getB()+getC());
		
	}
	
	public int areaOfTriangle()
	{//return 2;
		return (int) ((0.5)*(getA()+getB()+getC()));
		
	}

}
