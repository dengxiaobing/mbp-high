package cn.niudehua.mbphigh.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: deng
 * @datetime: 2020/8/21 11:25 下午
 */
@Configuration
@EnableTransactionManagement
public class MyBatisPlusConfiguration {
    /**
     * 乐观锁插件
     *
     * @return OptimisticLockerInterceptor
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
