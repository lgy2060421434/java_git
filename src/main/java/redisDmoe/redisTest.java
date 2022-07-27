package redisDmoe;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class redisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.auth("123456");
        System.out.println("连接成功");
        System.out.println("服务正在运行" + jedis.ping());
        Set<String> set = jedis.keys("*");
        System.out.println("提交一次");
        System.out.println("哈哈哈");
        for (String keys : set) {
            System.out.println(keys);
        }
    }

}
