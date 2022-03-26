package com.liu.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
      /*
       * 配置全局跨域请求
       * */
      @Override
      public void addCorsMappings(CorsRegistry registry) {

            registry.addMapping("/**").
                    allowedHeaders("*").
                    allowedMethods("*").
                    maxAge(1800).
                    allowedOrigins("http://localhost:8081");
      }
}
