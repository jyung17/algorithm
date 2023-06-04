import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("a|b|c")).filter(s -> !s.isEmpty()).toArray(String[]::new);
        String[] empty = {"EMPTY"};
        answer = answer.length > 0 ? answer : empty;
        return answer;
    }
}