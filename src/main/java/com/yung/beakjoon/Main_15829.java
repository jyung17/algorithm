package com.yung.beakjoon;

/*

*/

import java.io.IOException;
import java.util.Scanner;

public class Main_15829 {
  static final int M = 1234567891;
  
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    
    int L = scanner.nextInt();
    String str = scanner.next();
    long result = 0;
  
    for (int i = 0; i < L; i++) {
      int tmp = str.charAt(i) - 'a' + 1;
      result += tmp * result(i);
    }
    System.out.println(result % M);
  }
  
  public static long result(int b) {
    return b == 0 ? 1 : 31 * result(b - 1) % M;
  }
}