import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> collect = IntStream.rangeClosed(0, 9).boxed().collect(Collectors.toList());

        return collect.stream()
            .filter(n -> Arrays.stream(numbers).boxed().noneMatch(Predicate.isEqual(n)))
            .mapToInt(Integer::intValue).sum();
    }
}