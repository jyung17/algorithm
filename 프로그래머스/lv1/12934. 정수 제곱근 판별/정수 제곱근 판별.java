class Solution {
    public long solution(long n) {
        long answer = -1;
        double sqrt = Math.sqrt(n);
        answer = sqrt % 1 == 0.0 ? (long) Math.pow(sqrt + 1, 2) : answer;
        return answer;
    }
}