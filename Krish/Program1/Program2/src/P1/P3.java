package P1;

import java.util.HashMap;

public class P3 {
    public static void main(String[] args) {
        String name = "nsam";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + ":" + map.get(key));
            }
        }
    }
}
