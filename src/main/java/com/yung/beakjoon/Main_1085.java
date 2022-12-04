package com.yung.beakjoon;

/*
한수는 지금 (x, y)에 있다.
직사각형은 각 변이 좌표축에 평행하고,
왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main_1085 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    int x = sc.nextInt();
    int y = sc.nextInt();
    int w = sc.nextInt();
    int h = sc.nextInt();
  
    int min_x = (w - x) > x ? x : (w - x); // x 좌표 최소값
    int min_y = (h - y) > y ? y : (h - y); // y 좌표 최소값
    System.out.println(min_x > min_y ? min_y : min_x);
  }
}