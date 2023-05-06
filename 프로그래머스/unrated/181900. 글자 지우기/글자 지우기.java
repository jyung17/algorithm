import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] split = my_string.split("");
        for (int index : indices) {
          split[index] = "";
        }
        return Arrays.asList(split).stream().collect(Collectors.joining());
    }
}