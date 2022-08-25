package com.example.demoredis.config;

import lombok.RequiredArgsConstructor;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@RequiredArgsConstructor
public class CachingConfig {

    private final ApplicationProperties properties;

    @Bean
    public RedissonClient createConexion() throws IOException {
        Config config = new Config();
        String redisUrl = String.format("redis://%s:%s",
                properties.getHost()+"",properties.getPort() +"");
        config.useSingleServer().setAddress(redisUrl);
        config.useSingleServer().setDatabase(3);
        return Redisson.create(config);
    }

}
