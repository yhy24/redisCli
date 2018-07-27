package com.redis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: yhy
 * @Date: 2018/7/24 18:23
 * @Version 1.0
 */
public class ReTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "yang");
        map.put("age", "23");
        map.put("gender", "man");
        map.put("qq", "1234");
     /*   for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            System.out.println(iterator);
           Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry);
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }*/
        Set set = map.keySet();
        for (Object set1:set) {
            System.out.println(set1);
            System.out.println(set1+"----------"+map.get(set1.toString()));
        }
    }
}
