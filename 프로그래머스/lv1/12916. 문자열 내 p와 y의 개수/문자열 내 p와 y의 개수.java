import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();
        long p = Arrays.stream(str.split("")).filter(i -> i.equals("p")).count();
        long y = Arrays.stream(str.split("")).filter(i -> i.equals("y")).count();
        answer = p == y ? true : false;
        return answer;
    }
}