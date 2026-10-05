package P1;

import java.util.HashMap;

public class P4 {
    public static void main(String[] args) {
        String name []= {"nsam","nmait","nmam","nsam"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
           String ch = name[i];
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + ":" + map.get(key));
            }
        }
    }
}
