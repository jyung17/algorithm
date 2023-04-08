import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        List<String> list = Arrays.asList(s.split(""));
        String answer = list.stream()
            .filter(i -> Collections.frequency(list, i) == 1)
            .sorted()
            .collect(Collectors.joining());
        return answer;
    }
}