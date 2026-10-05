import java.util.HashMap;

public class P1 {

    public static void main(String[] args) {
        int a[]={10,20,30,40,50,10};
        HashMap<Integer,Integer> map=new HashMap<>();
        map .put(10,1);
        map .put(10,5);
        map .put(20,4);
        map .put(50,6);
        map .put(70,8);
        map .put(80,3);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(10));
        System.out.println(map.isEmpty());
        System.out.println(map.get(10));
        System.out.println(map.getOrDefault(10,0));
    }

}
