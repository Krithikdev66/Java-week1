package P1;

import java.util.HashMap;

public class P2 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,10,30,20,50};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int n=a[i];
            if (map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else {
                map.put(n, 1);
            }
        }
        System.out.println(map);
        for(int key:map.keySet()){
            if (map.get(key)>1){
               System.out.println(key+":"+map.get(key));
            }
        }
    }
}
