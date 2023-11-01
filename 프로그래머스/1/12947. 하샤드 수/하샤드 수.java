class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int y = x;
        int sum = 0;

        while(x > 0) {
          sum += x % 10;
          x /= 10;
        }

        answer = y % sum == 0 ? true : false;
        return answer;
    }
}