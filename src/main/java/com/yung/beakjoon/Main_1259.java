package com.yung.beakjoon;

/*

*/

import java.io.IOException;
import java.util.Scanner;

public class Main_1259 {
  
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
  
    while(true) {
      String str = scanner.nextLine();
      boolean check = true;
      if (str.charAt(0) == '0') {
        break;
      }
      for (int i = 0; i < str.length()/2; i++) {
        if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
          check = false;
        }
      }
      System.out.println(check == true ? "yes" : "no");
    }
  }
}