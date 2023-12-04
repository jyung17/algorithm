import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<String> list = Arrays.asList(s.split(""));
        for (int i = 0; i < list.size(); i++) {
          int i1 = new StringBuffer(s.substring(0, i)).reverse().indexOf(list.get(i));
          answer[i] = i1 == -1 ? -1 : i1+1;
        }
        return answer;
    }
}