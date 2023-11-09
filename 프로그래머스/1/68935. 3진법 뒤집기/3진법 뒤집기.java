class Solution {
    public int solution(int n) {
        int answer = 0;
        String string = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(string).reverse();
        answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}