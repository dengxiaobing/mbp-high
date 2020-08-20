package cn.niudehua.mbphigh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.niudehua.mbphigh.mapper")
public class MbpHighApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbpHighApplication.class, args);
    }

}
