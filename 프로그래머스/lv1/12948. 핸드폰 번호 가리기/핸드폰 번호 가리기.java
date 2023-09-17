class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String prefix = phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");
        String suffix = phone_number.substring(phone_number.length() - 4);
        answer += prefix + suffix;
        return answer;
    }
}