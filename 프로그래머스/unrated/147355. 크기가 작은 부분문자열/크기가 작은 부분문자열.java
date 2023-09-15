class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tSize = t.length();
        int pSize = p.length();
        for (int i = 0; i <= tSize - pSize; i++) {
          String substring = t.substring(i, i + pSize);
          if(Long.parseLong(substring) <= Long.parseLong(p)) {
            answer++;
          }
        }
        return answer;
    }
}