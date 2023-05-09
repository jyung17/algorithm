import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> arrayList = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        ArrayList<Integer> temp = new ArrayList<>();
        boolean check = true;
        for (int i = 0; i < query.length; i++) {
          if (check) {
            for (int j = 0; j <= query[i]; j++) {
              temp.add(arrayList.get(j));
            }
            arrayList = temp;
            temp = new ArrayList<>();
            check = false;
          } else {
            for (int k = query[i]; k < arrayList.size(); k++) {
              temp.add(arrayList.get(k));
            }
            arrayList = temp;
            temp = new ArrayList<>();
            check = true;
          }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}