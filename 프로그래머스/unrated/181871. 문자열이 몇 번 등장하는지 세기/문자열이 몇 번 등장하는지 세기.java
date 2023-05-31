class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int i=0;
        int j=pat.length()-1;
        while (j < myString.length()) {
          if (myString.substring(i, j+1).equals(pat)) {
            answer++;
          }
          i++;
          j++;
        }
        return answer;
    }
}