class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] split = cipher.split("");
        for (int i = code-1; i < split.length; i += code) {
          answer+=split[i];
        }
        return answer;
    }
}