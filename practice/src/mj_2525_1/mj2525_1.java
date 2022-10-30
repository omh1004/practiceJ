package mj_2525_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mj2525_1 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int C = Integer.parseInt(br.readLine());


    if ((B + C) > 60) {
      A += ((B + C) / 60);
      B = ((B + C) % 60);

      if (A >= 24) {
        A %=  24;
      }
      System.out.println(A + " " + B);
    } else {
      System.out.println(A + " " + (B+C));
    }
  }
}
