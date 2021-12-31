package PROGRMLIST;

public class LargeNOARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {600,800,400,7,8,99,88,55,43,33,9999,100000,5,4,333,222,1111};
				
			//
			//{6,7,8,9,400,3000,200,7777,4,7000};
			//{7,6,80000,400,500,60};
		
		int length=a.length,max=a[0];
	
		System.out.println("Largest number from array :");
		for (int i = 0; i < length; i++)
	
			if(a[i]>max)
				max=a[i];
		System.out.println(max);
		}
}
