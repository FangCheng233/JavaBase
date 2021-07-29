package com.fc.base.spring.demo2;

import java.lang.annotation.*;

/**
 * @ClassName Autowired
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/26 5:16 下午
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Target(ElementType.FIELD)
public @interface Autowired {
}
