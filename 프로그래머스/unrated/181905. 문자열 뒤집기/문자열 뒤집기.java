import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int s, int e) {
        String[] split = my_string.split("");
        String substring = my_string.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(substring);
        String s1 = sb.reverse().toString();

        for (int i = 0; i < s1.length(); i++) {
          split[s + i] = s1.charAt(i) + "";
        }

        return Arrays.asList(split).stream().collect(Collectors.joining());
    }
}