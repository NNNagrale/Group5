package PROGRMLIST;

public class CHARCount 
{
	public static void main(String a[])
	{
		String s=" welcome to the velocity snehal";
		int count=0,i;
		
		for(i=0;i<s.length();i++) 
		{
			if(s.charAt(i)!= ' ')
			
			    count++;	
		
		}
		
		System.out.println("The character count of string is "+count);
		}
	

}
