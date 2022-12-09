package com.yung.interview.primitive;

/*
2진수의 패리티(parity)는 1로 세팅된 비트의 개수와 같다.
즉, 1이 홀수 개이면 1, 짝수 개이면 0이 된다.
1011의 패리티는 1
10001000의 패리티는 0
패리티는 데이터를 저장하거나 네트워크로 통신을 할 때 오류를 확인하는 용도로 사용된다.
 */

public class parity {
  
  public static void main(String[] args) {
    System.out.println(parity(0x00101100));
    System.out.println(parity(0x00101110));
    System.out.println(parity2(0x00101100));
    System.out.println(parity2(0x00101110));
    System.out.println(parity3(0x00101100));
    System.out.println(parity3(0x00101110));
  }
  
  public static short parity(long x) {
   short result = 0;
    while (x != 0) {
      result ^= (x & 1);
      x >>>= 1;
    }
    return result;
  }
  
  public static short parity2(long x) {
    short result = 0;
    while (x != 0) {
      result ^= 1;
      x &= (x -1); // x의 하위 비트를 지운다.
    }
    return result;
  }
  
  public static short parity3(long x) {
    x ^= x >>> 32;
    x ^= x >>> 16;
    x ^= x >>> 8;
    x ^= x >>> 4;
    x ^= x >>> 2;
    x ^= x >>> 1;
    return (short)(x & 0x1);
  }
}
