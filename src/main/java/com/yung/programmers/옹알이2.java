package com.yung.programmers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 옹알이2 {
  
  public static void main(String[] args) {
  
    String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
    System.out.println(solution(babbling));
    String str = "ayaye";
    String[] strTemp = str.split("aya|ye");
    for (String s : strTemp) {
      System.out.println(s);
    }
    
  }
  
  public static int solution(String[] babbling) {
    int count = 0;
    // 문자열 배열을 담을 리스트 생성
    List<String[]> list = new ArrayList<>();
    for (int i = 0; i < babbling.length; i++) {
      // 문자열 split으로 자른다. 만약 이 안에 있는 원소로만 잘린다면 빈칸이 됨
      String[] temp = babbling[i].split("aya|ye|woo|ma");
      // 문자열 배열을 리스트에 넣는다.
      list.add(temp);
    }
    // 리스트 안의 문자열 배열의 빈칸의 갯수를 셈 (빈칸 == 모든 문자가 다 사라짐을 의미)
    for (int i = 0; i < list.size(); i++) if (list.get(i).length == 0) count++;
    return count;
  }
}
