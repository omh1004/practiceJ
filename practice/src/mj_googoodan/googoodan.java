package mj_googoodan;

public class googoodan {

  public static void main(String[] args) {
    System.out.println("구구단 연습");
    System.out.println("=========================================================");

    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.print(i + "*" + j + "=" + i * j + "\t");
      }
      System.out.println();
    }

    System.out.println("=========================================================");

    for (int i = 1; i <= 9; i++) {
      for (int j = 2; j <= 9; j++) {
        System.out.print(j + "*" + i + "=" + i * j + "\t");
      }
      System.out.println();
    }
  }
}
