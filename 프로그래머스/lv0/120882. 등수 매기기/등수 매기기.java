class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int ranking = 1;
        for (int i = 0; i < score.length; i++) {
          for (int j = 0; j < score.length; j++) {
            if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) {
              ranking++;
            } else if(score[i][0] + score[i][1] == score[j][0] + score[j][1]){
              continue;
            }
          }
          answer[i] = ranking;
          ranking=1;
        }
        return answer;
    }
}