package mj_25304;

import java.io.IOException;
import java.util.Scanner;

public class mj_25304_1 {
  public static void main(String[] args) throws IOException{

    Scanner sc = new Scanner(System.in);

    int total = sc.nextInt();
    int count = sc.nextInt();

    for(int i = 0 ; i < count ; i++) {
      int price = sc.nextInt();
      int gift = sc.nextInt();

      total -= (price*gift);     
    }

    if(total == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}
