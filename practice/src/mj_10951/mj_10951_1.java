package mj_10951;

import java.util.Scanner;

public class mj_10951_1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println(a+b);
			
		}
		
		in.close();
	}
}
