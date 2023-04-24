class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for (int i : num_list) {
          if (i % 2 == 0) {
            odd += i;
          } else {
            even += i;
          }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}