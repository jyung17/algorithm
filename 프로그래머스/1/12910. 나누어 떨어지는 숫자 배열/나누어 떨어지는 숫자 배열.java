import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        int[] array = Arrays.stream(arr).sorted().filter(i -> i % divisor == 0).boxed()
        .mapToInt(Integer::intValue).toArray();

        if (array.length != 0) {
          answer = array;
        } else {
          answer = new int[] {-1};
        }
        
        return answer;
    }
}