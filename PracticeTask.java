package Loops;

import java.util.Scanner;

public class PracticeTask {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the value of n: ");
		        int n = sc.nextInt();
		        
		        int first = 0, second = 1;
		        System.out.print("Fibonacci Sequence: " + first + " " + second);
		        
		        for (int i = 2; i < n; i++) {
		            int next = first + second;
		            System.out.print(" " + next);
		            first = second;
		            second = next;
		        }
		    }
		


	}


