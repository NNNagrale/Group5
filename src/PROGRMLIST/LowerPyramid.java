package PROGRMLIST;

public class LowerPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=4;
		for(int i=4;i>=0;i--)
		{
			for(int k=s-i;k>0;k--)
			{
				System.out.print(" ");
			}
				for(int j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
				
				System.out.println();
			}
		

	}

}
