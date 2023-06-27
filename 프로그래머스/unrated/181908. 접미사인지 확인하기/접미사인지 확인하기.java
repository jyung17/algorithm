import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> collect = IntStream.range(0, my_string.length())
            .mapToObj(my_string::substring)
            .collect(Collectors.toList());
  
        return collect.stream().anyMatch(Predicate.isEqual(is_suffix)) ? 1 : 0;
    }
}