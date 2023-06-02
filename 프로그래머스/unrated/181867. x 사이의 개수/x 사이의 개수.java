import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        String[] xes = myString.split("x", -1);
        for (String x : xes) {
          answer.add(x.length());
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}