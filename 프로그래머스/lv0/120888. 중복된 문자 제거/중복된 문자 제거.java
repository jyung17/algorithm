import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return Arrays.asList(my_string.split("")).stream().distinct().collect(Collectors.joining());
    }
}