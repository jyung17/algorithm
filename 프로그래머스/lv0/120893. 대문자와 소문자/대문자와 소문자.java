import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return Arrays.asList(my_string.split("")).stream()
        .map(s -> s.charAt(0) > 96 ? s.toUpperCase() : s.toLowerCase())
        .collect(
            Collectors.joining());
    }
}