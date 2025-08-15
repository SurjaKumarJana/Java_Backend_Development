package org.surja.spring_data_redis_demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.surja.spring_data_redis_demo.entity.Product;

@Configuration
public class Redisconfig {

    @Bean
    public RedisTemplate<String, Product> productRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String, Product > template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new Jackson2JsonRedisSerializer<Product>(Product.class));

        return  template;
    }


}
