package kapil.defaultpackage;


import java.util.Scanner;

public class palindrome {
	
	
	public static void main(String[] args)
	{
		palindrome a=new palindrome();
		a.takeInput();
		a.check();
		
	}

	private String inputString;
	private boolean ispalindrome=true;
	private int[] vowelCount=new int[5];
	public String getInputString() {
		return inputString;
	}
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	
	public int[] getVowelCount() {
		return vowelCount;
	}
	public void setVowelCount(int[] vowelCount) {
		this.vowelCount = vowelCount;
	}


	private void takeInput()
	{
		Scanner in=new Scanner(System.in);
		inputString=in.nextLine();
	
				

		
	}
	private void check()
	{System.out.println(inputString);
		int length=inputString.length();
		
		int counter=length-1;
		for(int i=0;i<(length/2);i++)
		{counter=length-1-i;
			if(inputString.charAt(i)!=inputString.charAt(counter))
			{
				ispalindrome=false;
				
			}	
			checkVowel(inputString.charAt(counter));
			checkVowel(inputString.charAt(i));
		
		}
		if(length%2==1)
		{
			checkVowel(inputString.charAt((length/2)));
		}
		if(ispalindrome)
		System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");
		
		System.out.println("vowels--  a-"+vowelCount[0]+" e "+vowelCount[1]+" i "+vowelCount[2]+" o "+vowelCount[3]+" u "+vowelCount[4]);
	}
	
	private void checkVowel(char a)
	{
		int x=6;
		switch(a)
		{case 'a':x=0;break;
		case 'e':x=1;break;
		case 'i':x=2;break;
		case 'o':x=3;break;
		case 'u':x=4;break;
		}
		if(x!=6)
		{vowelCount[x]++;}
	}
	
}
