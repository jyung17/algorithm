import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] s = my_string.split(" ");
        for (String s1 : s) {
          if (!s1.equals("")) {
            answer.add(s1);
          }
        }

        return answer.toArray(new String[0]);
    }
}