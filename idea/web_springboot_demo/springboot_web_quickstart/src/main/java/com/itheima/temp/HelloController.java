package com.itheima.temp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/29
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

// 定义请求处理类，使用@RestController注解，表示该类是一个控制器类，所有请求都返回JSON数据
@RestController
public class HelloController {
    @RequestMapping("/hello")  // 定义请求路径，访问该路径时，调用hello()方法
    public String hello() {
        System.out.println("Hello World!");
        // 返回JSON数据
         return "{\"message\":\"Hello World!\"}";
    }
}
