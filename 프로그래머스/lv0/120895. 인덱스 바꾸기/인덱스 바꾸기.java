import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        List<String> str = Arrays.asList(my_string.split(""));
        String tmp = str.get(num1);
        str.set(num1, str.get(num2));
        str.set(num2, tmp);
        return str.stream().collect(Collectors.joining());
    }
}