import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        String[] split = my_string.split("");
        for (int[] query : queries) {
          int a = query[0];
          int b = query[1];
          String prefix = "";
          String midfield = "";
          String suffix = "";

          prefix = answer.substring(0, a);
          midfield = answer.substring(a, b+1);
          suffix = answer.substring(b+1, answer.length());

          StringBuffer sb = new StringBuffer(midfield);
          sb.reverse();

          answer = prefix + sb + suffix;
        }

        return answer;
    }
}