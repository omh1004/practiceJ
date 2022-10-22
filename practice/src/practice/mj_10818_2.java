package practice.mj_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class mj_10818_2 {
  public static void main(String[] args) throws IOException{

    System.out.println("BuffedReader를 사용한 입력값받기");

    BufferedReader br = new BufferedReader(new   InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine() , " ");

    int index = 0;

    int[] num = new int[N];

    while(st.hasMoreTokens()) {

      num[index] = Integer.parseInt( st.nextToken());
      index++;
    }

    Arrays.sort(num);

    System.out.println(num[0] + " " +num[num.length]);

  }
}
