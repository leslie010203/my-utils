package com.util.myutil.jedisUtil.demo;

import com.util.myutil.jedisUtil.JedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author: wangchuan
 * @Date: 2018/12/12 11:16
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        JedisUtil jedisUtil = new JedisUtil();
        Jedis jedis = jedisUtil.getJedis();
        jedisUtil.set("name","xxxxxx");
        jedisUtil.returnJedis(jedis);

    }
}
