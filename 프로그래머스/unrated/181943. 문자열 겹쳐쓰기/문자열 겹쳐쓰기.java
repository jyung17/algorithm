import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] split = my_string.split("");
        for (int i = 0; i < overwrite_string.length(); i++) {
          split[i+s] = String.valueOf(overwrite_string.charAt(i));
        }
        return Arrays.stream(split).collect(Collectors.joining());
    }
}