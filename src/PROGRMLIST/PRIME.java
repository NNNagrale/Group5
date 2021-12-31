package PROGRMLIST;

public class PRIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 
		    boolean isPrime = true;  
		  
		    for (int i=1; i<=100; i++)
			  {
			int count =0;
		    for(int j=2; j <= i/2; j++)
		    {  
		      if((i % j) == 0) 
		      {  
		         count++;
		        break;  
		      }  
		    }  
		    if(isPrime && count==0 &&   i!=1)
		    	System.out.println(i+ " is Prime");  
		    else 
		    	System.out.println(i+" is Not Prime");  
		 
			  }
			  }
			  }
		
		
/*		System.out.println("Prime numbers are :");
	  for (int i=1; i<=100; i++)
	  {
	int count =0;
	for(int j=2;j<=i/2;j++)
	{
		if (i%j == 0) 
		  {
	        count++;
	        break;
	      }
		
	}
	
	
	if(count==0 && i!=1)
	{
		System.out.println(i);
	}
		  // condition for not a prime number
	      
	  
		  
	    }

	    }
		
}*/

