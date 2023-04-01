import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = (my_string.toLowerCase()).split("");
        answer = Stream.of(arr).sorted(String::compareTo).collect(Collectors.joining());
        return answer;
    }
}