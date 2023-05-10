import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> pre_List = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
          pre_List.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
          pre_List.add(num_list[i]);
        }

        return pre_List.stream().mapToInt(Integer::intValue).toArray();
    }
}