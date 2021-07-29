package com.fc.base.spring.demo2;

import java.lang.annotation.Annotation;
import java.util.stream.Stream;

/**
 * @ClassName Test
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/26 5:19 下午
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Class<? extends Controller> clazz = controller.getClass();
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            Annotation annotation = field.getAnnotation(Autowired.class);
            if (annotation != null) {
                field.setAccessible(true);

                Class<?> type = field.getType();
                Object o;
                try {
                    o = type.newInstance();
                    field.set(controller, o);
                }catch (Exception e){

                }
            }
        });
        System.out.println(controller.getName().hashCode());
    }
}
