package cn.niudehua.mbphigh.mapper;

import cn.niudehua.mbphigh.domain.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/8/20 12:27 上午
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> mySelectList(@Param(Constants.WRAPPER) Wrapper<User> wrapper);
}