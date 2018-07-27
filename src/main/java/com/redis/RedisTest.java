package com.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yhy
 * @Date: 2018/7/24 10:04
 * @Version 1.0
 */
public class RedisTest {
    static Jedis jedis;
    static{
        jedis = new Jedis("192.168.182.135", 8787); //192.168.182.135 6379    192.168.91.129  8955
    }
    public static void main(String[] args) {
        System.out.println(jedis.ping());
        jedis.set("yang", "zhang");
        System.out.println(jedis.get("yang"));
/*//        jedis.set("yang", "hao");
        jedis.set("num", "8");
        jedis.incr("num");
        System.out.println(jedis.get("num"));
        System.out.println("获取:"+jedis.get("yhy"));
        System.out.println(jedis.exists("yang"));

        Map map = new HashMap();
        map.put("name", "leilei");
        map.put("age", "23");
        map.put("gender", "girl");
        map.put("qq", "0000");
        jedis.hmset("zmap", map);*/
        String user= jedis.get("201807241739551085228113");
        System.out.println(user);


    }
}
