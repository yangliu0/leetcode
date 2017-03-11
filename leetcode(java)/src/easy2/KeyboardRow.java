package easy2;

import java.util.*;

/**
 * 500. Keyboard Row
 * Given a List of words, return the words that can be typed
 * using letters of alphabet on only one row's of American keyboard like the image below.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> list = new LinkedList<>();
        if (words == null) {
            return list.toArray(new String[0]);
        }
        String[] strs = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                map.put(c, i);
            }
        }
        for (String s : words) {
            if (s.equals("")) {
                continue;
            }
            int index = map.get(s.toUpperCase().charAt(0));
            for (char c : s.toUpperCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] strs = {"Hello", "Alaska", "Dad", "Peace"};
        String[] strs1 = {};
        System.out.println(Arrays.toString(new KeyboardRow().findWords(strs)));
        System.out.println(Arrays.toString(new KeyboardRow().findWords(null)));
        System.out.println(Arrays.toString(new KeyboardRow().findWords(strs1)));
    }
}
