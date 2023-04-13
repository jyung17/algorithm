class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
          String[] split = quiz[i].split(" ");
          if (split[1].equals("-")) {
            answer[i] = Integer.parseInt(split[4]) == Integer.parseInt(split[0]) - Integer.parseInt(split[2]) ? "O" : "X";
          } else {
            answer[i] = Integer.parseInt(split[4]) == Integer.parseInt(split[0]) + Integer.parseInt(split[2]) ? "O" : "X";
          }
        }
        return answer;
    }
}