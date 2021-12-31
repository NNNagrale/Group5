package PROGRMLIST;

public class UsingAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=2,c=70,d=9;     //ladderif
	     
		if(a>b && a>c && a>d)
	    {	
		   System.out.println("a is greater");
	  
		    if( b>c && b>d  )  
	          {
			     System.out.println("b is greater");
			  			  
		                if( c>d )
		               {
			             System.out.println("c is greater");
		                }
	                      else
		                         {
			                       System.out.println("d is greater");
		                            }
	            }  
		       else
			        {
				      System.out.println("c & d greater than b");
			          }
		     }  
	      else
	  {
		System.out.println("b, c, d greater than a");
	    }
      }  

	}


