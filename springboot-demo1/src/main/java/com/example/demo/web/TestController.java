package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by liurq on 2017/7/31.
 */
@Controller
@RequestMapping("/devops")
public class TestController {
    /**
     * 获取自动化测试计划列表
     *
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String getAutoTestPlanList() {
        return "hello devops!";
    }
}