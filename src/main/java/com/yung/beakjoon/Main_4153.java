package com.yung.beakjoon;

/*
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4153 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    while (true) {
      StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
  
      int a = Integer.parseInt(stringTokenizer.nextToken());
      int b = Integer.parseInt(stringTokenizer.nextToken());
      int c = Integer.parseInt(stringTokenizer.nextToken());
  
      if(a == 0 && b == 0 && c == 0) break;
  
      if(c * c == a * a + b * b) {
        System.out.println("right");
      } else if (b * b == a * a + c * c) {
        System.out.println("right");
      } else if (a * a == b * b + c * c) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}