package PROGRMLIST;

public class Fibonacci {
		
		public static void main(String[] args)
		{
			int a=0,b=1,result;
			
			
			System.out.println("Fibonacci series :");
		    System.out.println(a);
			
			for(int i=0;i<=7;i++)
			{
				result=a+b;
			    a=b;
				b=result;
				
				System.out.println(result);
				
			}
		}

	}


