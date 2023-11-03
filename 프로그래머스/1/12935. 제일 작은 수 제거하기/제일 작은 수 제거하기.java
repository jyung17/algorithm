import java.util.Arrays;
import java.util.NoSuchElementException;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
          return new int[] {-1};
        } else {
          int minValue = Arrays.stream(arr)
              .min()
              .orElseThrow(NoSuchElementException::new);
          answer = Arrays.stream(arr)
              .filter(s -> s != minValue)
              .boxed()
              .mapToInt(Integer::intValue)
              .toArray();
        }
        return answer;
    }
}