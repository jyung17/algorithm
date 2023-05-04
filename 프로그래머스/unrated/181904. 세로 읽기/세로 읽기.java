class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] split = my_string.split("(?<=\\G.{" + m + "})");
        for (int i = 0; i < split.length; i++) {
          answer += split[i].charAt(c-1);
        }
        return answer;
    }
}