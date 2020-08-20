package cn.niudehua.mbphigh;

import cn.niudehua.mbphigh.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: deng
 * @datetime: 2020/8/20 12:38 上午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {
    @Autowired
    private UserMapper userMapper;

    public void deleteById() {

    }
}
