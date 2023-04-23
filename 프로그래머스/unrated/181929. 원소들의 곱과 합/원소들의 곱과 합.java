class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int square = 0;
        for (int i : num_list) {
          mul *= i;
          square += i;
        }
        answer = mul < Math.pow(square, 2) ? 1 : 0;
        return answer;
    }
}