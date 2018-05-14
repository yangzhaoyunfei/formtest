package com.example.formtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author tangzhongwei tangzw@zjbdos.com
 * @date 2018/05/14
 */
@RestController
public class Controller {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/*")
    public TestEntity test(TestEntity model) {
        return model;
    }


}
