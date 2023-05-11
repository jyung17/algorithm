import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
          switch (str_list[i]) {
            case "l":
              return Arrays.copyOf(str_list, i);
            case "r":
              return Arrays.copyOfRange(str_list, i+1, str_list.length);
          }
        }
        return answer;
    }
}