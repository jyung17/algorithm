class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String tmp = A;
        if (A.equals(B)) {
          return answer;
        } else {
          for (int i = 0; i < A.length(); i++) {
            tmp = tmp.charAt(A.length()-1) + tmp.substring(0,A.length()-1);
            if(tmp.equals(B)) {
              return answer+i+1;
            }
          }
        }
        return answer=-1;

    }
}