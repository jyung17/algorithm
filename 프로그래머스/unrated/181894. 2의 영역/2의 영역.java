import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int min = 100_000;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] == 2) {
            if (max < i) max = i;
            if (min > i) min = i;
          }
        }

        if (max == 0) {
          return answer;
        } else {
          for (int i = min; i <= max; i++) {
            list.add(arr[i]);
          }

          return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}