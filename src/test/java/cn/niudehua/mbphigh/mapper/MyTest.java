package cn.niudehua.mbphigh.mapper;

import cn.niudehua.mbphigh.domain.User;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/8/20 12:38 上午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MyTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void deleteById() {
        int i = userMapper.deleteById(1094592041087729666L);
        log.info("==>logicDelete:{}", i);
        Assert.assertEquals(1, i);
    }

    @Test
    public void selectAll() {
        List<User> users = userMapper.selectList(null);
        users.forEach(u -> log.info("==>user:{}", u));
        Assert.assertNotNull(users);
    }

    @Test
    public void updateById() {
        User user = User.builder().age(26).id(1088248166370832385L).build();
        int i = userMapper.updateById(user);
        log.info("==>update:{}", i);
        Assert.assertEquals(1, i);
    }

    @Test
    public void mySelectList() {
        List<User> users = userMapper.mySelectList(Wrappers.<User>lambdaQuery().gt(User::getAge,20).eq(User::getDeleted,0));
        users.forEach(u -> log.info("==>user:{}", u));
        Assert.assertNotNull(users);
    }

}
