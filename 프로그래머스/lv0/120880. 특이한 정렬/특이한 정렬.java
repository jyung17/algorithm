import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> nums = new ArrayList<>();
        Arrays.sort(numlist);
        for (int num : numlist) nums.add(num);
        nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
        nums.forEach(System.out::print);
        Collections.reverse(nums);
        return nums.stream().mapToInt(num -> num).toArray();
    }
}