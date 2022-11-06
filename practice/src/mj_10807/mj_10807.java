package mj_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mj_10807 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int lng = Integer.parseInt(br.readLine());

    int[] num = new int[lng];
    int count =  0;

    for(int i = 0 ; i < num.length ; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }

    int num2 = Integer.parseInt(br.readLine());

    for(int j :num ) {
      if(j == num2) count++;
    }

    System.out.println(count);
  }
}
