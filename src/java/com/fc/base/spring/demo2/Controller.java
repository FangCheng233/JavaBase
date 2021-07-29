package com.fc.base.spring.demo2;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/26 5:17 下午
 * @Version 1.0
 */
public class Controller {
    @Autowired
    private String name;

    /**
     * Gets the value of name. *
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }
}
