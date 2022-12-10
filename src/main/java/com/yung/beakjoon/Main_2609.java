package com.yung.beakjoon;

/*

*/

import java.io.IOException;
import java.util.Scanner;

public class Main_2609 {
  
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
  
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = 0;
    int lcd = x*y;
    while (x % y != 0) {
      z = x % y;
      x = y;
      y = z;
    }
    System.out.println(y);
    System.out.println(lcd/y);
  }
}