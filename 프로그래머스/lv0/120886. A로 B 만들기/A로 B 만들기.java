import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        String collect = Arrays.asList(before.split("")).stream().sorted()
        .collect(Collectors.joining());
    String collect1 = Arrays.asList(after.split("")).stream().sorted()
        .collect(Collectors.joining());
    return collect.equals(collect1) ? 1 : 0;
      }
}