package com.yung.beakjoon;

import java.util.Scanner;

/*
734와 893을 칠판에 적었다면,
상수는 이 수를 437과 398로 읽는다.
따라서, 상수는 두 수중 큰 수인 437을 큰 수이다.
*/

public class Main_2908 {
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int aReverse = 0;
    int bReverse = 0;
    while (a != 0) {
      aReverse = aReverse * 10 + a % 10;
      a/=10;
    }
    while (b != 0) {
      bReverse = bReverse * 10 + b % 10;
      b/=10;
    }
    System.out.println(aReverse > bReverse ? aReverse : bReverse);
  }
}