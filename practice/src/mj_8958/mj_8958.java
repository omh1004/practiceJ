package mj_8958;

import java.util.Scanner;

public class mj_8958 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);


    // String 배열에  크기를 입력받는다.
    String[] arr = new String[in.nextInt()];


    // 배열을 돌면서 , OX를 입력받는다.
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.next();
    }

    in.close();


    // 배열을 돌면서 , 각 배열값의 String length만큼 돌면서 , 
    // charAt으로 , O  가 있으면 cnt ++  , X면 , cnt 0으로 초기화 
    // Sum에 담는다.
    // 다돌면 , sum 출력
    for (int i = 0; i < arr.length; i++) {

      int cnt = 0;
      int sum = 0;

      for (int j = 0; j < arr[i].length(); j++) {

        if (arr[i].charAt(j) == 'O') {
          cnt++;
        } else {
          cnt = 0;
        }

        sum += cnt;
      }

      System.out.println(sum);
    }
  }
}
