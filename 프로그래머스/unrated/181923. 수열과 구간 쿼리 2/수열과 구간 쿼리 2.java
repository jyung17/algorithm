import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
          int[] query = queries[i];
          int[] ints = Arrays.copyOfRange(arr, query[0], query[1] + 1);
          answer[i] = Arrays.stream(ints).boxed().filter(k -> k > query[2]).mapToInt(Integer::intValue)
              .min().orElse(-1);
        }
        return answer;
    }
}