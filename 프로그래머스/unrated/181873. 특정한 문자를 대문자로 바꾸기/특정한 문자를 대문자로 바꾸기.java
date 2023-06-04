import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = Arrays.stream(my_string.split("")).map(s -> s.equals(alp) ? s.toUpperCase() : s).collect(
        Collectors.joining());
        return answer;
    }
}