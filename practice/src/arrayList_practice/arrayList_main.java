package arrayList_practice;

import java.util.ArrayList;

public class arrayList_main {
  public static void main(String[] args) {





    ArrayList<memberDto> arr = new ArrayList<memberDto>();




    // DTO 를 가지고 ArrayList에 값을 새로 넣어줄때는 반복문안에서 넣어줄때마다,
    // 객체를 새로 생성해 주어야한다.

    for(int i = 0 ; i<= 10 ; i++) {
      memberDto m = new memberDto();
      m.setName("a"+Integer.toString(i));
      arr.add(m);
    }


    for(memberDto member : arr) {
      System.out.println(member.getName());
    }


  }
}
