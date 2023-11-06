class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        answer = length % 2 != 0 ? s.charAt(length / 2) + "" : s.substring(length / 2 - 1, length / 2 + 1) + "";
        return answer;
    }
}