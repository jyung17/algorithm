class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
          int i1 = my_string.charAt(i) - 0;
          if (i1 >= 48 && i1 <= 57) {
            answer += Integer.parseInt(my_string.charAt(i) + "");
          }
        }
        return answer;
    }
}