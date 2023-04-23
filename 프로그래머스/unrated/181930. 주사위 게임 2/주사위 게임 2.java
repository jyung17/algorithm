class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int square = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int cube = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        if (a != b && a != c && b != c) {
          answer = sum;
        } else if ((a != b && b == c) || (a != b && a == c) || (a != c && a == b)) {
          answer = sum * square;
        } else if (a == b && a == c) {
          answer =  sum * square * cube;
        }
        return answer;
    }
}