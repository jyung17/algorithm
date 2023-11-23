import java.util.ArrayList;
import java.util.List;

class Solution {
        public String solution(String s) {
            String answer = "";
            String[] split = s.split(" ", -1);
            List list = new ArrayList<>();
            for (String s1 : split) {
              String[] world = s1.toLowerCase().split("");
              for (int i = 0; i < world.length; i++) {
                if (i % 2 == 0) {
                  world[i] = world[i].toUpperCase();
                }
              }
              list.add(String.join("", world));
            }
            answer = String.join(" ", list);
            return answer;
        }
}