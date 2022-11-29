package com.yung;

import java.util.Scanner;

/*
검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지
고유번호의 처음 5자리의 숫자들이 04256이면,
각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수
*/

public class Main_2475 {
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    // 고유번호 5자리를 받을 배열
    int[] input = new int[5];
    // 각 숫자를 제곱한 수들의 합을 저장할 변수
    int result = 0;
    for (int i = 0; i < input.length; i++) {
      input[i] = sc.nextInt();
      input[i] *= input[i];
      result += input[i];
    }
    // 각 숫자를 제곱한 수들의 합을 10으로 나눈 나머지를 계산
    System.out.println(result % 10);
  }
}