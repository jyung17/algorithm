import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int n) {
        return Arrays.asList(my_string.split("")).stream()
            .map(s -> s.repeat(n))
            .collect(Collectors.joining());
    }
}