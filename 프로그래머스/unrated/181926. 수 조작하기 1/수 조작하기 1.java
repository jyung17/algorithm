class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] split = control.split("");
        for (int i = 0; i < split.length; i++) {
          String a = split[i];
          if ("w".equals(a)) {
            answer += 1;
          } else if ("s".equals(a)) {
            answer -= 1;
          } else if ("d".equals(a)) {
            answer += 10;
          } else if ("a".equals(a)) {
            answer -= 10;
          }
        }
        return answer;
    }
}