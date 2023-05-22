class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
          char c = myString.charAt(i);
          if (c == 65 || c == 97) {
            answer += (c + "").toUpperCase();
          } else {
            answer += (c + "").toLowerCase();
          }
        }
        return answer;
    }
}