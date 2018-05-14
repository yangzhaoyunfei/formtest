package com.example.formtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 *
 * @author tangzhongwei tangzw@zjbdos.com
 * @date 2018/05/14
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public TestEntity test(TestEntity model) {
        System.out.println(model);
        return model;
    }


}
