class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int number : numbers) {
          sum += number;
        }

        answer = sum / (double) numbers.length;
        return answer;
    }
}