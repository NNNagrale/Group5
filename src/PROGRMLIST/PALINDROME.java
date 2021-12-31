package PROGRMLIST;

public class PALINDROME {

	public static void main(String[] args)
	{	 
	int a=12221;
	int reverse=0,temp,reminder;
	
		for(temp=a;a!=0;a=a/10)
		
	{
		reminder=a%10;
		reverse=reverse*10+reminder;
		
	}
	
		 if(temp==reverse)
		 {
			 System.out.println(temp+ " is palindrome");
		 }
		 else
			 System.out.println(temp+" is not palindrome");
			
	}

}
