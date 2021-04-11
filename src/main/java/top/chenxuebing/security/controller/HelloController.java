package top.chenxuebing.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen.xuebing
 * @date 2021/4/11 20:18
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("name")
    public String name(String name){
        return "name:" + name;
    }
}
