class Solution {
    public int solution(int n, int t) {
        int answer = n * 1;
        for (int i = 1; i < t+1; i++) {
          answer = answer * 2;
        }
        return answer;
    }
}