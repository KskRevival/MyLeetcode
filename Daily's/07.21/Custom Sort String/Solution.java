import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String customSortString(String order, String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        CustomChar[] chars = new CustomChar[str.length()];

        for (int i = 0; i < order.length(); i++) map.put(order.charAt(i), i);

        for (int i = 0; i <chars.length; i++) {
            char tmp = str.charAt(i);
            CustomChar curr = map.containsKey(tmp)? new CustomChar(tmp, map.get(tmp)) : new CustomChar(tmp, order.length() + tmp);
            chars[i]= curr;
        }

        Arrays.sort(chars);

        for (CustomChar c : chars) builder.append(c.character);

        return builder.toString();
    }

    private static class CustomChar implements Comparable<CustomChar>{
        char character;
        int value;

        CustomChar(char character, int value) {
            this.character = character;
            this.value = value;
        }

        @Override
        public int compareTo(CustomChar o) {
            return this.value - o.value;
        }
    }
}
//3ms 34.61%
//37.2mb 58.42%
