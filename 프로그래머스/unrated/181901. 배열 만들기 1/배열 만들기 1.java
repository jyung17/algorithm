import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n/k; i++) {
          list.add(k * i);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}