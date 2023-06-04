import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        int answer = Arrays.stream(myString.split(""))
            .map(s -> s.equals("A") ? "B" : "A")
            .collect(Collectors.joining()).contains(pat) ? 1 : 0;
        return answer;
    }
}