import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] split = String.valueOf(n).split("");
        for (String s : split) {
          answer += Integer.parseInt(s);
        }
        return answer;
    }
}