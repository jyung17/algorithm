import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split(""))
            .map(s -> s.charAt(0) < 108 ? s.replace(s, "l") : s)
            .collect(Collectors.joining());
    }
}