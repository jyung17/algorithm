import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : strArr) {
          map.put(s.length(), map.getOrDefault(s.length(), 0) + 1);
        }

        for (int value : map.values()) {
          if (value > answer) {
            answer = value;
          }
        }
        return answer;
    }
}