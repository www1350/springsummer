package com.absurd.summer.web;

import com.absurd.summer.annotation.Controller;
import com.absurd.summer.annotation.RequestMapping;
import com.absurd.summer.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangwenwei
 * @time 2018/3/9
 */
@Controller
@RequestMapping("/hello")
public class HelloWordController {
    @RequestMapping("/helloworld")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam("param") String param){
        System.out.println(param);
        try {
            response.getWriter().write( "doTest method success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @RequestMapping("/helloworld2")
    public String test2(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam("param") String param){
        System.out.println(param);
        return  "doTest method success! param:"+param;
    }

}
