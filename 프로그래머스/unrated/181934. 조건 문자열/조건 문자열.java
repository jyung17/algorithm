class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<")) {
          return eq.equals("=") ? (n <= m ? 1 : 0) : (n < m ? 1 : 0);
        } else {
          return eq.equals("=") ? (n >= m ? 1 : 0) : (n > m ? 1 : 0);
        }
    }
}