package PROGRMLIST;

public class Factorial {

	public static void main(String[] args) {
		
		int i,fact=1;
		for(i=1;i<=5;i++)
		{
			fact=fact*i;      // 1=1*1; 1= 1*2; 2=2*3; 6=6*4; 24=24*5;  
			}
		System.out.println("factorial is "+fact);
		
	}

}


//using while loop
//while(i<=5)
//fact=fact*i;
//i++: