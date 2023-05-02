class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int i=0;
        for (int[] part : parts) {
          answer += my_strings[i].substring(part[0], part[1]+1);
          i++;
        }
        return answer;
    }
}