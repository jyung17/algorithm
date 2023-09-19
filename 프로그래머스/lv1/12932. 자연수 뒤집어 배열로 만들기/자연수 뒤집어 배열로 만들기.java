import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        List<Long> a = new ArrayList<>();
        while (n != 0) {
          a.add(n % 10);
          n /= 10;
        }
        answer = a.stream().mapToInt(Long::intValue).toArray();
        return answer;
    }
}