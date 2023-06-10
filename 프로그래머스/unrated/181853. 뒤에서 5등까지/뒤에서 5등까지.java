import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list;
        Arrays.sort(answer);
        return Arrays.copyOf(answer, 5);
    }
}