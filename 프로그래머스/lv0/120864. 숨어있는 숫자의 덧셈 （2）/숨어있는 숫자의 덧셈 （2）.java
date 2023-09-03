class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split("[^0-9]", -1);
        for (String s : split) {
          if (!s.equals("")) {
            answer += Integer.parseInt(s);
          }
        }
        return answer;
    }
}