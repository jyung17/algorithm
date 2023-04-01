class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String a = "";
        for (int i = 0; i < array.length; i++) {
          a = String.valueOf(array[i]);
          for (int j = 0; j < a.length(); j++) {
            if ((a.charAt(j) - '0') == 7) {
              answer++;
            }
          }
        }
        return answer;
    }
}