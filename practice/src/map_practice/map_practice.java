package map_practice;

import java.util.HashMap;
import java.util.Map;

public class map_practice {
  public static void main(String[] args) {
    int[] arr = {1, 2,4,4,5,6,7,8,9};

    Map<Integer , Integer> map = new HashMap<>();
    Map<String , Integer> map2 = new HashMap<>();

    for(int i = 0 ;i <  arr.length;i++) {

      int num = arr[i];
      System.out.println(arr[i]);
      map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }

    for(int i = 0 ;i <  arr.length;i++) {

      int num = arr[i];
      System.out.println(arr[i]);
      map2.put(String.valueOf(arr[i]), map2.getOrDefault(arr[i], 0)+1);
    }

    System.out.println(map);
    System.out.println(map2);

  }
}
