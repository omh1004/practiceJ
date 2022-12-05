package pj_1712;

import java.util.Scanner;

public class pj_1712_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		

		if(B>= C) {
			System.out.println("-1"); 
		}
		else {
		 System.out.println((A/(C-B))+1); 
		}
		
		

	}
}
c