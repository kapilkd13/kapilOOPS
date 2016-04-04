import java.util.Scanner;

import kapil.defaultpackage.palindrome;


public class election {
	
	
	public static void main(String[] args)
	{
		election a=new election();
		a.takeinput();
		a.printoutput();
		
	}
	
	private int[] output=new int[6];
	private boolean votemore=true;
	
	private void takeinput()
	{
		while(votemore)
		{
			System.out.println("give your vote!!");
			Scanner in=new Scanner(System.in);
		
			int num=in.nextInt();
			switch(num)
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:output[num]++;break;
				default:output[0]++;
			}
			System.out.println("enter 1 to vote more");
			int n=in.nextInt();
			if(n!=1)
				votemore=false;
		}
		
	}
	
	private void printoutput()
	{
		for(int i=0;i<(6);i++)
			System.out.println(	" votes for contestant "+i+" are "+output[i]);
		
	}

}
