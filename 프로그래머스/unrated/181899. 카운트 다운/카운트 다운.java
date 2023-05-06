import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        Integer[] ints = IntStream.rangeClosed(end, start).boxed().toArray(Integer[]::new);
        Arrays.sort(ints, Comparator.reverseOrder());
        return Arrays.stream(ints).mapToInt(i -> i).toArray();
    }
}