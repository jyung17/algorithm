import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        OptionalInt max = IntStream.of(array).max();
        answer[0] = max.getAsInt();
        for (int i = 0; i < array.length; i++) {
          if (array[i] == answer[0]) {
            answer[1] = i;
          }
        }
        return answer;
    }
}