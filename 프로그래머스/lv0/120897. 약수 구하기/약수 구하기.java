import java.util.ArrayList;
import java.util.List;

class Solution {
    public Integer[] solution(int n) {
    List<Integer> answer = new ArrayList<>();
    for (int i = 1; i < n+1; i++) {
      if (n % i == 0) {
        answer.add(i);
      }
    }
    return answer.toArray(new Integer[answer.size()]);
  }
}