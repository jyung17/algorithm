class Solution {
    public int solution(int a, int b) {
        int B = b / gcd(a, b);
        while (B != 1) {
          if (B % 2 == 0) {
            B /= 2;
          } else if (B % 5 == 0) {
            B /= 5;
          } else {
            return 2;
          }
        }
        return 1;
    }
    
    
  public int gcd(int a, int b) {
    if(a%b ==0) {
      return b;
    }
    return gcd(b, a%b);
  }
}