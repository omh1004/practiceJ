package mj_15596;

import java.util.Scanner;

public class mj_15596_1 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] a = new int[in.nextInt()];

		for (int i = 0; i < a.length; i++) {

			a[i] = in.nextInt();
		}

		long sum = new Test().sum(a);

	}
}
