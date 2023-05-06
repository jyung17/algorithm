import java.util.HashMap;

class Solution {
    public int[] solution(String my_string) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",	0);
        map.put("B",	1);
        map.put("C",	2);
        map.put("D",	3);
        map.put("E",	4);
        map.put("F",	5);
        map.put("G",	6);
        map.put("H",	7);
        map.put("I",	8);
        map.put("J",	9);
        map.put("K",	10);
        map.put("L",	11);
        map.put("M",	12);
        map.put("N",	13);
        map.put("O",	14);
        map.put("P",	15);
        map.put("Q",	16);
        map.put("R",	17);
        map.put("S",	18);
        map.put("T",	19);
        map.put("U",	20);
        map.put("V",	21);
        map.put("W",	22);
        map.put("X",	23);
        map.put("Y",	24);
        map.put("Z",	25);
        map.put("a",	26);
        map.put("b",	27);
        map.put("c",	28);
        map.put("d",	29);
        map.put("e",	30);
        map.put("f",	31);
        map.put("g",	32);
        map.put("h",	33);
        map.put("i",	34);
        map.put("j",	35);
        map.put("k",	36);
        map.put("l",	37);
        map.put("m",	38);
        map.put("n",	39);
        map.put("o",	40);
        map.put("p",	41);
        map.put("q",	42);
        map.put("r",	43);
        map.put("s",	44);
        map.put("t",	45);
        map.put("u",	46);
        map.put("v",	47);
        map.put("w",	48);
        map.put("x",	49);
        map.put("y",	50);
        map.put("z",	51);

        int[] answer = new int[52];
        int a = 0;
        for (int i = 0; i < my_string.length(); i++) {
          Integer integer = map.get(my_string.charAt(i)+"");
          answer[integer] += 1;
        }

        return answer;
    }
}