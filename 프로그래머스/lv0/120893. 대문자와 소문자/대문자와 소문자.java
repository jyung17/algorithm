class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] split = my_string.split("");
        for (int i = 0; i < split.length; i++) {
          answer += split[i].charAt(0) > 96 ? split[i].toUpperCase() : split[i].toLowerCase();
        }

        return answer;
    }
}