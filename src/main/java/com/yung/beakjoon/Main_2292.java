package com.yung.beakjoon;

/*

*/

import java.io.IOException;
import java.util.Scanner;

public class Main_2292 {
  public static void main(String[] args) throws IOException {
   Scanner scanner = new Scanner(System.in);
   
   int n = scanner.nextInt();
   int count = 1;
   int range = 2;
   
   if(n ==1) {
     System.out.println(1);
   }
   else {
     while (range <= n) { // 범위가 n보다 커지기 직전까지 반복
       range = range + (6 * count); // 다음 번위와 최솟값으로 초기화
       count++; // count 1 증가
     }
     System.out.println(count);
   }
  }
}