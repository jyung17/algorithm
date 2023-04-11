import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Solution {
    public int solution(int order) {
        int answer = 0;
        List<String> list = Arrays.asList("3", "6", "9");
        return (int) Arrays.asList(String.valueOf(order).split("")).stream()
        .filter(s -> list.stream().anyMatch(Predicate.isEqual(s)))
        .count();
    }
}