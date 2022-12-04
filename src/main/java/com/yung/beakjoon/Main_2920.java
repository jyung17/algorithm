package com.yung.beakjoon;

import java.util.Scanner;

/*
8개 음이 숫자로 주어짐
1부터 8까지 순서대로면 ascending,
8부터 1까지 순서대로면 descending,
둘 다 아니면 mixed 로 출력
*/

public class Main_2920 {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 크기가 8인 int형 배열 선언하여 입력받는다.
    int[] inputs = new int[8];
    for (int i = 0; i < inputs.length; i++) {
      inputs[i] = sc.nextInt();
    }
    sc.close();
  
    String result = "";
    // 0~6까지 반복문을 돌려서 현제 인덱스 값과 다음의 인덱스 값을 비교
    // 두값의 차이가 -1이면 ascending 차이가 1이면 descending
    // 둘다 아니라면 mixed
    for (int i = 0; i < inputs.length - 1; i++) {
      if (inputs[i] == inputs[i + 1] - 1) {
        result = "ascending";
      } else if (inputs[i] == inputs[i + 1] + 1) {
        result = "descending";
      } else {
        result = "mixed";
        break;
      }
    }
    System.out.println(result);
  }
}