class Solution {
    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
          int a = Integer.parseInt(split[i]) + 97;
          char ch = (char) a;
          answer += ch;
        }

        return answer;
      }
}