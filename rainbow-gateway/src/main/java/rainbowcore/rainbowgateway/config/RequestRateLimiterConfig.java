package rainbowcore.rainbowgateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * 网关请求限流配置类
 * author  dengjie9527
 * date 2019/10/12
 */
@Configuration
public class RequestRateLimiterConfig {

    /**
     * 根据请求参数中的 user 字段来限流
     * @return
     */
    @Bean
    KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }

    /**
     * 根据请求 IP 地址来限流
     * @return
     */
    @Bean
    public KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
