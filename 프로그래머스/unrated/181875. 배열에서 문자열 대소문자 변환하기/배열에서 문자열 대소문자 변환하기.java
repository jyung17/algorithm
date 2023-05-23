class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = strArr;
        boolean check = true;
        for (int i = 0; i < answer.length; i++) {
          if (check) {
            answer[i] = answer[i].toLowerCase();
            check = false;
          } else {
            answer[i] = answer[i].toUpperCase();
            check = true;
          }
        }
        return answer;
    }
}