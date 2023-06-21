import java.util.Arrays;
import java.util.function.Predicate;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr).boxed()
            .filter(a -> Arrays.stream(delete_list).boxed().noneMatch(Predicate.isEqual(a)))
            .mapToInt(Integer::intValue).toArray();
    }
}