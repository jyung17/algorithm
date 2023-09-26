import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        return Long.parseLong(
            Arrays.asList(String.valueOf(n).split(""))
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}