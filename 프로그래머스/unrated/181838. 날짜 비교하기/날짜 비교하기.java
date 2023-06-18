import java.time.LocalDateTime;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDateTime ldate1 = LocalDateTime.of(date1[0], date1[1], date1[2], 0, 0);
        LocalDateTime ldate2 = LocalDateTime.of(date2[0], date2[1], date2[2], 0, 0);
        return ldate1.isAfter(ldate2) || ldate1.isEqual(ldate2) ? 0 : 1;
  }
}