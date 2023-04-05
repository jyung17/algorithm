import java.util.Arrays;
import java.util.function.Predicate;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = (int) Arrays.stream(s1)
            .filter(s -> Arrays.stream(s2).anyMatch(Predicate.isEqual(s)))
            .count();
        return answer;
    }
}