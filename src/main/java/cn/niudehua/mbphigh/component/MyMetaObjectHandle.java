package cn.niudehua.mbphigh.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author: deng
 * @datetime: 2020/8/21 10:44 下午
 */
@Component
@Slf4j
public class MyMetaObjectHandle implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasGetter("createTime")) {
            if (Objects.isNull(getFieldValByName("createTime", metaObject))) {
                log.info("~~~insertFill~~~createTime~~~");
                setFieldValByName("createTime", LocalDateTime.now(), metaObject);
            }
        }
        if (metaObject.hasGetter("version")) {
            log.info("~~~insertFill~~~version~~~");
            setFieldValByName("version", 1, metaObject);
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasGetter("updateTime")) {
            if (Objects.isNull(getFieldValByName("updateTime", metaObject))) {
                log.info("~~~updateFill~~~updateTime~~~");
                setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
            }
        }
    }

    /**
     * 重写填充策略，有值（且不为null）不覆盖
     * @param metaObject  metaObject
     * @param fieldName fieldName
     * @param fieldVal fieldVal
     * @return MetaObjectHandler
     */
    @Override
    public MetaObjectHandler strictFillStrategy(MetaObject metaObject, String fieldName, Supplier<Object> fieldVal) {
        Object o = fieldVal.get();
        if (Objects.nonNull(o)) {
            metaObject.setValue(fieldName, o);
        }
        return this;
    }
}
