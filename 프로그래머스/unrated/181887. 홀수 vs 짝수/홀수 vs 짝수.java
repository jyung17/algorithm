class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int ood = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
          if (i % 2 == 0) {
            even += num_list[i];
          } else if (i % 2 != 0) {
            ood += num_list[i];
          }
        }
        if (ood >= even) {
          answer = ood;
        } else {
          answer = even;
        }
        return answer;
    }
}