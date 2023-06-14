import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] str_list, String ex) {
        return Arrays.asList(str_list).stream()
            .filter(s -> !s.contains(ex))
            .collect(Collectors.joining());
    }
}