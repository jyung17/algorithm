import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> answer = new ArrayList<>();
        if (direction.equals("right")) {
          answer.add(numbers[numbers.length-1]);
          for (int i = 0; i < numbers.length - 1; i++) {
            answer.add(numbers[i]);
          }
        } else {
          for (int i = 1; i < numbers.length; i++) {
            answer.add(numbers[i]);
          }
          answer.add(numbers[0]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}