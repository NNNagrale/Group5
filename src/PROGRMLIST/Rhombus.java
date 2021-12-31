package PROGRMLIST;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
        for (int i = 1; i <= 5; i++)
        {
            // Print space
            for (int j = i; j < 5; j++) {
                System.out.print(' ');
            }
 
            // Print n stars
            for (int j = 1; j <= 5; j++) {
                System.out.print('*');
            }
 
            // Move to the next row
            System.out.println();
        }
    
	}

}
