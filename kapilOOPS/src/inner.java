import java.util.Scanner;

import kapil.defaultpackage.palindrome;


public class inner {
	
	public static void main(String[] args)
	{
		inner a=new inner();
		a.callinner();
	
		
	}
	private void callinner()
	{
		innerclass b=new innerclass();
		b.takeInput();
		b.sort();
		b.output();
	}
	private int[] numarr=new int[5];
	private class innerclass{
		
		public void takeInput()
		{
			Scanner in=new Scanner(System.in);
			for(int i=0;i<(5);i++)
			numarr[i]=in.nextInt();
			
			
		}
		public void sort()
		{
			
			for(int i=0;i<4;i++)
			{
				for(int j=i+1;j<5;j++)
				{
					if(numarr[i]>numarr[j])
					{int swap=numarr[i];
					numarr[i]=numarr[j];
					numarr[j]=swap;}
				}
				
			}
			
			
		}
		private void output()
		{
			for(int i=0;i<(5);i++)
			System.out.println(	numarr[i]);
			
		}
		
	}
	

}
