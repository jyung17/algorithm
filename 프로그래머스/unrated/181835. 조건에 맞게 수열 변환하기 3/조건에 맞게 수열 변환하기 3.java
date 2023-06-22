class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        boolean isEven = k % 2 == 0;
        for (int i = 0; i < answer.length; i++) {
          answer[i] = isEven ? answer[i] + k : answer[i] * k;
        }
        return answer;
    }
}