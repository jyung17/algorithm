class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        for (int i = 0; i < code.length(); i++) {
          if (code.charAt(i)-'0' == 1) {
            mode = mode ? false : true;
            continue;
          }
          if (mode) {
            if (i % 2 == 0) {
              answer += code.charAt(i);
            }
          } else {
            if (i % 2 == 1) {
              answer += code.charAt(i);
            }
          }
        }
        answer = answer.isEmpty() ? "EMPTY" : answer;
        return answer;
    }
}