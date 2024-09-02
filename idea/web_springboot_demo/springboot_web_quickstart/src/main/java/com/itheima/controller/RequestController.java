package com.itheima.controller;


import com.itheima.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/31
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

@RestController
public class RequestController {
    // 原始方式
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        // 获取请求参数
//        String name = request.getParameter("name");
//        String age_str = request.getParameter("age");
//        int age = Integer.parseInt(age_str);
//        // 业务逻辑处理
//        System.out.println("Call of simpleParam");
//        System.out.println("Name:" + name + ", Age:" + age);
//        // 返回结果
//        return "OK";
//    }
    // SpringBoot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam("name") String user_name, @RequestParam(required = false) Integer age) {
        // 业务逻辑处理
        System.out.println("Call of simpleParam");
        System.out.println("Name:" + user_name + ", Age:" + age);
        // 返回结果
        return "OK";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println("Call of simplePojo");
        System.out.println(user.toString());
        return "OK";
    }

    @RequestMapping("/complexPojo")
    public String simpleComplexPojo(User user) {
        System.out.println("Call of simpleComplexPojo");
        System.out.println(user.toString());
        return "OK\t" + user.toString();
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobbys) {
        System.out.println("Call of arrayParam");
        StringBuilder temp = new StringBuilder();
        for (String hobby : hobbys) {
            System.out.println(hobby);
            temp.append(hobby).append(" ");
        }
        return "OK\t" + temp;
    }

    @RequestMapping("/listParam")
    public <list> String listParam(@RequestParam List<String> hobbys) {
        // 必须添加@RequestParam注解
        System.out.println("Call of listParam");
        System.out.println(hobbys.toString());
        return "OK\t" + hobbys.toString();
    }

    @RequestMapping("/mapParam")  // 测试map参数
    public String mapParam(HttpServletRequest request) {
        // 获取请求参数
        String name = request.getParameter("name");
        String age_str = request.getParameter("age");
        int age = Integer.parseInt(age_str);
        // 业务逻辑处理
        System.out.println("Call of mapParam");
        System.out.println("Name:" + name + ", Age:" + age);
        // 返回结果
        return "OK\t" + name + "\t" + age;
    }
}
