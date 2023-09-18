import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).asDoubleStream().average().getAsDouble();
        return answer;
    }
}