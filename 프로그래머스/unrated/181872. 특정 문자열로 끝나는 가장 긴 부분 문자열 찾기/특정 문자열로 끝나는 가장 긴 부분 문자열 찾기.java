class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int i = myString.lastIndexOf(pat);
        if (i != -1) {
          answer = myString.substring(0, i + pat.length());
        }
        return answer;
    }
}