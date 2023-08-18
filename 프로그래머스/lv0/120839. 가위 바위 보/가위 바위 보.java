import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        Map<String, String> rspMap = new HashMap<>(){
          {
            put("2", "0");
            put("0", "5");
            put("5", "2");
          }
        };

        String[] split = rsp.split("");
        for (String s : split) {
          answer += rspMap.get(s);
        }

        return answer;
    }
}