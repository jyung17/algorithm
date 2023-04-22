class Solution {
  public int solution(int n) {
    int answer = 0;
    answer = n % 2 == 0 ? even(n) : odd(n);
    return answer;
  }
  
  public static int odd(int n) {
    int oddSum = 0;
    for (int i = 1; i < n+1; i++) {
      if (i % 2 == 1) {
        oddSum += i;
      }
    }
    return oddSum;
  }
  
  public static int even(int n) {
    int evenSum = 0;
    for (int i = 1; i < n+1; i++) {
      if (i % 2 == 0) {
        evenSum += i*i;
      }
    }
    return evenSum;
  }
}