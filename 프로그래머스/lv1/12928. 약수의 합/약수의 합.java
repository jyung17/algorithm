import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = IntStream.range(1, n + 1).filter(s -> n % s == 0).sum();
        return answer;
    }
}