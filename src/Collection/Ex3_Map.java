package Collection;

import java.util.HashMap;

public class Ex3_Map {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("x",1);
        hashMap.put("y",1);
        hashMap.put("z",1);
        hashMap.put("l",1);

        System.out.println(hashMap);
        for(String key: hashMap.keySet()){
            System.out.println("key: " + key);
        }
        for(Integer value: hashMap.values()){
            System.out.println("value: " + value);
        }
    }
}
