package com.yung.beakjoon;

/*
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
*/

import java.util.Scanner;

public class Main_2231 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // n: 256

    int result = 0;
    
    // n: 256 i: 198
    for (int i = 0; i < n; i++) { // i는 입력받은 n(분해합)까지 반복
      int number = i; // i=198; number=198;
      int sum = 0; // 각 자릿수 합을 저장할 변수
  
      while (number != 0) { // number: 198, number: 19, number: 1
        sum += number % 10; // 각 자릿수의 합 sum: 8 + 9 + 1, sum: 18
        number /= 10;
      }
  
      // n: 216 i: 198 sum: 18
      if (sum + i == n) { // i값과 각 자릿수의 합이 같을 경우 == 생성자
        result = i; // result: 198
        break;
      }
    }
    System.out.println(result);
  }
}