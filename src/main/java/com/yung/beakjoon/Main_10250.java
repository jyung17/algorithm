package com.yung.beakjoon;

/*
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

예제 입력
2
6 12 10
30 50 72

예제 출력
402
1203
*/

import java.util.Scanner;

public class Main_10250 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int h = scanner.nextInt(); // 6
      int w = scanner.nextInt(); // 12
      int n = scanner.nextInt(); // 10
      int y = n % h; // 층수 -> 10 % 6 = 4
      int x = n / h + 1; // 호수 -> 10 / 6 + 1 = 2
      // 층수와 n번째 사람의 수가 같을때
      if (y == 0) {
        x = n/h;
        y = h;
      }
      System.out.println(y*100+x);
    }
  }
}