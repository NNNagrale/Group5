package PROGRMLIST;

import java.util.Scanner;

public class STRbySCANNER {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner s=new Scanner(System.in);
		String str = s.nextLine();
		
		String reverse="";
		int length=str.length()-1;
		for(int i=length;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);

	}

}
