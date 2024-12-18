package com.example.eurekaconsumer.Config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

//RestTemplate 是阻塞的，它会在请求完成之前阻塞当前线程。
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced  //负载均衡
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
        SimpleClientHttpRequestFactory factory=new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);//配置连接超时时间
        factory.setConnectTimeout(15000);//配置读取超时时间
        return factory;
    }
}
