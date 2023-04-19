package Ngay18_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TuDien {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Nam",30);
        hashMap.put("Nữ",18);
        hashMap.put("Bắc",20);
        hashMap.put("Hà",42);
        hashMap.put("Trung",22);
        System.out.println("Hiển thị theo hashMap:");
        System.out.println(hashMap+"\n");
        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println("Hiển thị theo tree map:");
        System.out.println(treeMap);
        Map<String,Integer> linkedMap=new LinkedHashMap<>(16,0.7f,true);
        linkedMap.put("Smith", 30);
        linkedMap.put("Anderson", 31);
        linkedMap.put("Lewis", 29);
        linkedMap.put("Cook", 29);
        System.out.println(linkedMap.get("Smith"));

    }


}
