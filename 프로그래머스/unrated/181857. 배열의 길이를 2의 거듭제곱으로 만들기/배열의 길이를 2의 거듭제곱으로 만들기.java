import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> ints = IntStream.of(arr).boxed().collect(Collectors.toList());
        int size = arr.length;
        int count = 0;
        while (true) {
          if (powerNum(size+count)) {
            for (int i = 0; i < count; i++) {
              ints.add(0);
            }
            return ints.stream().mapToInt(Integer::intValue).toArray();
          }
          count++;
        }
    }
    
    public static boolean powerNum(int num) {
        //num이 1인 경우는 무조건 true
        if(num == 1){
          return true;
        }
        //num이 홀수이면 무조건 false;
        if(num % 2 != 0){
          return false;
        }
        //2를 거듭제곱해서 비교할 수의 초기값은 2
        int powerNum = 2;
        //powerNum이 num보다 작을때까지만 while문 진행
        while(powerNum < num){
          powerNum *= 2;
        }
        //반복이 끝나면 powerNum과 num이 같은지 비교값을 리턴
        return powerNum == num;
      }
}