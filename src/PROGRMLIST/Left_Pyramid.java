package PROGRMLIST;

public class Left_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Second and Third Quadrant * pattern is :");
		
		int s=4;
		for(int i=1;i<=4;i++)
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

		
		for(int i=3;i>=1;i--)
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