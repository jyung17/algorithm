class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coopon = (chicken / 10) + (chicken % 10);
        answer = chicken / 10;
        chicken = coopon;

        while (chicken >= 10) {
          coopon = (chicken / 10) + (chicken % 10);
          answer += chicken / 10;
          chicken = coopon;
        }
        return answer;
    }
}