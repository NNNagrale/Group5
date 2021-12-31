package PROGRMLIST;

public class Right_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i,j;
		
		System.out.println("First and forth Quadrant * pattern is :");//right pyramid
		for(i=0;i<=3;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		
		for(i=3;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}

	}

}
