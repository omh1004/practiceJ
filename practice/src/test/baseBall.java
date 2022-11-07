package com.omh.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baseBall {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int aws = sc.nextInt();
		sc.close();
		

		for(int i= 1 ; i <= 30 ;i++ ) {
			int m = (int)(Math.random()*10)+1;
			
			map.put(m, map.getOrDefault(m, 0) + 1);
		}
		
		if(map.containsKey(aws)) {
			
			if(map.get(aws)  == 1) {
				System.out.println("원스트라이크");
				System.out.println(map);
			}else if(map.get(aws) == 2) {
				System.out.println("투스트라이크");
				System.out.println(map);
			}else {
				System.out.println("홈런");
				System.out.println(map);
			}
			
		}else {
			System.out.println("삼진!!!!");
			System.out.println(map);
		}
	}
}
