package com.chinasoft;

import java.util.*;

/**
 * @author :Mr.Xu
 * Date    :2019-3-6
 */
public class Demo02 {
    /**
     * map集合的三种遍历方法
     */
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put("周瑜", "小乔");
        map.put("吕布", "貂蝉");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("令狐冲", "任盈盈");
        map.put("林平之", "岳灵珊");

        String string = map.get("令狐冲");
        System.out.println(string);


        Set<String> keySet = map.keySet();
        for (String string2 : keySet) {
            System.out.println(string2+"=="+map.get(string2));
        }
        System.out.println("-------------------");
        Iterator<String> it=keySet.iterator();
        while(it.hasNext()) {
            String str=it.next();
            System.out.println(str+"=="+map.get(str));
        }


        System.out.println("-----------");
        Collection<String> values = map.values();
        for (String string2 : values) {
            System.out.println(string2);
        }

        System.out.println("-------------------");


        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }
        Iterator<Map.Entry<String, String>> it1=entrySet.iterator();
        while(it1.hasNext()) {
            Map.Entry<String, String> str = it1.next();
            System.out.println(str);
        }
        System.out.println(map.toString());


    }
}
