class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int length = num_list.length;
        if (length >= 11) {
          for (int i : num_list) {
            answer+=i;
          }
        } else if(length <= 10) {
          answer = 1;
          for (int i : num_list) {
            answer*=i;
          }
        }
        return answer;
    }
}