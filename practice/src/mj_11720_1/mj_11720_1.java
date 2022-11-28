package mj_11720_1;

import java.util.Scanner;

public class mj_11720_1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		String num = in.next();
		in.close();
		
		
		int sum = 0 ;
		
		for(int i = 0 ; i < N  ; i++) {
			
			
			
			sum += num.charAt(i)-'0';
		}
		
		System.out.println(sum);
	}

}
