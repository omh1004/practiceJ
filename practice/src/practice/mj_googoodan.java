package practice;

public class mj_googoodan {
  public static void main(String[] args) {


    System.out.println("단별구구단_________________");

    for(int i = 2 ; i <= 9 ; i++) {
      for(int j = 1; j<=9 ; j++) {   
        System.out.print(i+"*"+j+"="+ i*j + "\t"); 
      }
      System.out.println();
    }

    System.out.println("곱하기 1부터");

    for(int i = 1 ; i <=9 ; i++) {
      for(int j = 2 ; j <=9 ; j++ ) {
        System.out.print(j+"*"+i+"="+j*i+"\t");        
      }
      System.out.println();
    }
  }
}
