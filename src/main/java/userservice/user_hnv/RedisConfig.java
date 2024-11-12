// package userservice.user_hnv;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.redis.connection.RedisConnectionFactory;
// import org.springframework.data.redis.core.RedisTemplate;
// import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
// import org.springframework.data.redis.serializer.StringRedisSerializer;
// import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisIndexedHttpSession;

// @Configuration
// @EnableRedisIndexedHttpSession
// public class RedisConfig {
    
//     @Bean
//     public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//         RedisTemplate<String, Object> template = new RedisTemplate<>();
//         template.setConnectionFactory(redisConnectionFactory);

//         // Sử dụng StringRedisSerializer cho khóa
//         template.setKeySerializer(new StringRedisSerializer());
//         template.setHashKeySerializer(new StringRedisSerializer());
        
//         // Sử dụng GenericJackson2JsonRedisSerializer cho giá trị
//         template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//         template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

//         return template;
//     }
// }

