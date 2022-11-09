package mj_5597;

import java.util.Scanner;

public class mj_5597_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean[] send = new boolean[30];

    for(int i = 0 ; i < 28 ; i++) {
      int num =   sc.nextInt();
      send[num-1] = true;
    }

    for(int i = 0 ; i < 30  ; i++) {
      if(!send[i]) {
        System.out.println(i+1);
      }
    } 
  }
}
