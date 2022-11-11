package mj_3052;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mj_3052_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Map<Integer, Integer> map = new HashMap<>();



    for( int i = 1 ; i <= 10; i++) {

      int m  = sc.nextInt();
      //입력값을 42로 남은 나머지를 구한다.
      int num = m %42;
      //나머지를 구한 값들을 키값으로 닮고 , 

      //없으면,  key 의 value 값을 0에서 1 증가시키고, 있으면, 있는value값에서 1증가시킨다. 
      map.put(num, map.getOrDefault(num, 0)+1);

    }
    //키값의 사이즈를 구한다.
    System.out.println(map.size());

  }
}
