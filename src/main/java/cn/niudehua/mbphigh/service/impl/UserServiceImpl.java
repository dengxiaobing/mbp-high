package cn.niudehua.mbphigh.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.niudehua.mbphigh.mapper.UserMapper;
import cn.niudehua.mbphigh.domain.User;
import cn.niudehua.mbphigh.service.UserService;

/**
 * @author: deng
 * @datetime: 2020/8/20 12:33 上午
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
