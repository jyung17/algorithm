import java.util.Arrays;

class Solution {
    public int solution(String num_str) {
        return Arrays.asList(num_str.split("")).stream().mapToInt(i -> Integer.parseInt(i)).sum();
    }
}