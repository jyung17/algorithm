package com.yung;

/*

*/

import java.io.IOException;
import java.util.Scanner;

public class Main_2798 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] value = new int[n];
    int sum = 0;
    int result = 0;
    
    for (int i = 0; i < n; i++) {
      value[i] = scanner.nextInt();
    }
    
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          sum = value[i] + value[j] + value[k];
          if (result < sum && sum <= m) {
            result = sum;
          }
        }
      }
    }
    System.out.println(result);
  }
}