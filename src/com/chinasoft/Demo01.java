package com.chinasoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author :Mr.Xu
 * Date    :2019-3-6
 */
public class Demo01 {
    /**
     * List集合4中遍历方法
     */
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("xu");
        list.add("yan");
        list.add("lei");

        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            String str = (String) array[i];
            System.out.println(str);

        }
        System.out.println("----------------------");

        for (int i = 0; i < list.size(); i++) {
            String  str = (String)list.get(i);
            System.out.println(str);
        }
        System.out.println("----------------------");

        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------------");
        ListIterator itlist = list.listIterator();
        while(itlist.hasNext()) {
            System.out.println(itlist.next());
        }


    }
}
