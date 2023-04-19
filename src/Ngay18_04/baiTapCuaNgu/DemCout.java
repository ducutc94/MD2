package Ngay18_04.baiTapCuaNgu;

import java.util.*;

public class DemCout {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<5;i++){
            arrayList.add(scanner.nextInt());
        }
        Map<Integer,Integer> map=new TreeMap<>();
        for (int element:arrayList){
            if(!map.containsKey(element)){
                map.put(element,1);
            }else {
                map.put(element, map.get(element)+1);
            }
        }Set<Integer> set=map.keySet();
        for(int element:set){
            System.out.println(element+" xuất hiện "+map.get(element)+ "lần");
        }
        }
    }
