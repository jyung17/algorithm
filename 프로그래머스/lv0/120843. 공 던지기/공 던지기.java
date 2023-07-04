class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for (int i = 0; i < k; i++) {
          answer = numbers[((k - 1) * 2) % numbers.length];
        }
        return answer;
    }
}