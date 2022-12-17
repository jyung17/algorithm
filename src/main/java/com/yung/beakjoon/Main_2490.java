package com.yung.beakjoon;

/*
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2490 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] arr = {"D", "C", "B", "A", "E"};
  
    for (int i = 0; i < 3; i++) {
      int sum = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      //hasMoreTokens() : token이 남아있을 때까지 loop를 돌린다.
      while (st.hasMoreTokens()) {
        sum += Integer.parseInt(st.nextToken());
      }
      System.out.println(arr[sum]);
    }
  }
}