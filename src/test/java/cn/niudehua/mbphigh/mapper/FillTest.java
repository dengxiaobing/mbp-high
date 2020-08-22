package cn.niudehua.mbphigh.mapper;

import cn.niudehua.mbphigh.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

/**
 * @author: deng
 * @datetime: 2020/8/20 12:38 上午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class FillTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = User.builder().name("嘻嘻").age(37).email("xx@baomidou.com").managerId(1087982257332887553L).createTime(LocalDateTime.now().minusDays(20)).build();
//        User user = new User();
//        user.setName("东方西");
//        user.setAge(28);
//        user.setEmail("dfx@baomidou,com");
//        user.setManagerId(1087982257332887553L);
        int insert = userMapper.insert(user);
        log.info("==>影响行数:{}", insert);
        Assert.assertEquals(1, insert);
    }

    @Test
    public void update() {
//        User user = User.builder().id(1296828056190623746L).name("西门东东").email("xmdd@baomidou.com").build();
        User user = new User();
        user.setId(1296843741373419522L);
        user.setName("东方西西");
        user.setEmail("dfxx@baomidou,com");
        user.setUpdateTime(LocalDateTime.now().minusDays(10));
        int updateById = userMapper.updateById(user);
        log.info("==>影响行数:{}", updateById);
        Assert.assertEquals(1, updateById);
    }

}
