import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        List<Integer> ints = new ArrayList<>();
        for (int i : num_list) {
          ints.add(i);
        }
        int size = ints.size() - 1;
        if (ints.get(size - 1) < ints.get(size)) {
          ints.add(ints.get(size) - ints.get(size - 1));
        } else {
          ints.add(ints.get(size) * 2);
        }
        answer = ints.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}