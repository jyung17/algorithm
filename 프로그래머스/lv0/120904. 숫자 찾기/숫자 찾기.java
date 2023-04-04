class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String t = String.valueOf(num);
        for (int i = 0; i < t.length(); i++) {
          if ((t.charAt(i) - '0') == k) {
            return answer = i+1;
          }
        }
        return answer;
    }
}