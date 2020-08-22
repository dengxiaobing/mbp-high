package cn.niudehua.mbphigh.mapper;

import cn.niudehua.mbphigh.domain.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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
public class OptTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void update() {
//        User user = User.builder().id(1296829852975960065L).name("西门东东").email("xmdd@baomidou.com").build();
//        User selectById = userMapper.selectById(user.getId());
//        user.setVersion(selectById.getVersion());
//        QueryWrapper<User> queryWrapper = Wrappers.<User>query().eq("id", 1296829852975960065L);
//        int update = userMapper.update(user, queryWrapper);
//        log.info("==>影响行数:{}", update);
//        Assert.assertEquals(1, update);
//        User user2 = User.builder().id(1296829852975960065L).name("西门东北").email("xmdb@baomidou.com").build();
//        User selectById2 = userMapper.selectById(user.getId());
//        user2.setVersion(selectById2.getVersion());
//        QueryWrapper<User> queryWrapper2 = Wrappers.<User>query().eq("id", 1296829852975960065L);
//        int update2 = userMapper.update(user2, queryWrapper2);
//        log.info("==>影响行数:{}", update2);
//        Assert.assertEquals(1, update2);
        User user = userMapper.selectById(1296843741373419522L);
        user.setName("哇哇");
        user.setEmail("ww@baomidou.com");
        int updateById = userMapper.updateById(user);
        log.info("==>影响行数:{}", updateById);
        Assert.assertEquals(1, updateById);

    }

}
