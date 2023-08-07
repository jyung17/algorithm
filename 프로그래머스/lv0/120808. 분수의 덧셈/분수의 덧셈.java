class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numerator = numer1 * denom2 + denom1 * numer2;
        int denominator = denom1 * denom2;

        int mod = gcd(numerator, denominator);

        answer[0] = numerator / mod;
        answer[1] = denominator / mod;
        return answer;
      }

      // 유클리드 호제법
      public static int gcd(int a, int b) {
        // a가 b보다 큰 경우에 대해서 유클리드 호제법 수행.
        if (a <= b) {
          int temp = a;
          a = b;
          b = temp;
        }

        if (b == 0) {
          return a;
        }
        return gcd(b , a % b);
      }
}