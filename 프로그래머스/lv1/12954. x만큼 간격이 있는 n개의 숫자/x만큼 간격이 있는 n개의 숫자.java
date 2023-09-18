import java.util.stream.LongStream;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = LongStream.range(1, n + 1).map(i -> i * x).boxed().mapToLong(Long::longValue)
        .toArray();
        return answer;
    }
}