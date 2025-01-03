package Loops;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {  
		    if (i == 3) break;  
		    System.out.println(i);  
		}

		System.out.println("----------------");
		
		for (int j = 5; j <= 10; j++)
		{
			if(j==8) break;
			System.out.println(j);
			
		}
		
		

	}

}
