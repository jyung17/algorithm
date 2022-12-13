package com.yung.programmers;

public class 옹알이 {
  
  public static void main(String[] args) {
  
    String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
    String[] originalBabList = {"aya", "ye", "woo", "ma"};
    String[] repeatBabList = {"ayaaya", "yeye", "woowoo", "mama"};
  
    int answer = 0;
  
    for (String bab : babbling) {
      for (String rBab : repeatBabList) {
        bab = bab.replace(rBab, "x");
      }
  
      for (String oBab : originalBabList) {
        bab = bab.replace(oBab, "?");
      }
      
      int count = 0;
      for (int i = 0; i < bab.length(); i++) {
        if (!bab.subSequence(i, i + 1).equals("?")) {
          count = 1;
          break;
        }
      }
  
      if (count == 0) {
        answer++;
      }
    }
    System.out.println("answer = " + answer);
  }
}
