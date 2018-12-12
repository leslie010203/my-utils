package com.util.myutil.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author: wangchuan
 * @Date: 2018/12/12 10:10
 * @Description: RedisConfiguration
 */
@Configuration
public class RedisConfiguration {

    @Bean(name = "jedis.pool")
    @Autowired
    public JedisPool jedisPool(@Qualifier("jedis.pool.config") JedisPoolConfig config,
                               @Value("${jedis.pool.pool.host}")String host,
                               @Value("${jedis.pool.port}")int port){
        return new JedisPool(config,host,port);
    }
    @Bean(name = "jedis.pool.config")
    public JedisPoolConfig jedisPoolConfig(@Value("${jedis.pool.config.maxTotal}")int maxTotal,
                                           @Value("${jedis.pool.config.maxIdle}")int maxIdle,
                                           @Value("${jedis.pool.config.maxWaitMillis}")int maxWaitMillis ){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(maxIdle);
        config.setMaxTotal(maxTotal);
        config.setMaxWaitMillis(maxWaitMillis);
        return config;
    }


}
