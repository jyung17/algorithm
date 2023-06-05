class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        if (arr1Size == arr2Size) {
          int aSum = 0;
          int bSum = 0;
          for (int i : arr1) aSum += i;
          for (int i : arr2) bSum += i;
          if (aSum == bSum) {
            return answer;
          }
          return answer = aSum > bSum ? 1 : -1;
        }
        return answer = arr1Size > arr2Size ? 1 : -1;
    }
}