package PROGRMLIST;

public class Quadrant_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=5;
		System.out.println("Third Quadrant * pattern is :");
		
		for(int i=5;i>=1;i--)
		{
			for(int b=s-1;b>=i;b--)
				
			{
				System.out.print(" ");;				
			}
					
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		
		
	}

	}

}
