import java.util.Arrays;

class Solution {
    public long solution(int i, int j, int k) {
        String tmp = "";
        for (int a = i; a < j+1; a++) {
          tmp+=String.valueOf(a);
        }
        return Arrays.asList(tmp.split("")).stream().filter(s -> s.contains(String.valueOf(k)))
            .count();
    }
}