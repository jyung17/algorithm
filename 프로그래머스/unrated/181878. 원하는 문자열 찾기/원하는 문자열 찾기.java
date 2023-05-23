class Solution {
    public int solution(String myString, String pat) {
        String s = myString.toLowerCase();
        String s1 = pat.toLowerCase();

        boolean contains = s.contains(s1);
        if (contains) {
          return 1;
        } else {
          return 0;
        }
    }
}