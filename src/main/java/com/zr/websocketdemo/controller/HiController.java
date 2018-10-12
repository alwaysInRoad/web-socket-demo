package com.zr.websocketdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
public class HiController {
 
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 
 
    @RequestMapping("/websocket/{name}")
    public String webSocket(@PathVariable String name,Model model){
        try{
            logger.info("跳转到websocket的页面上");
            //通过Model进行对象数据的传递
            model.addAttribute("username",name);
            return "socket";
        }
        catch (Exception e){
            logger.info("跳转到websocket的页面上发生异常，异常信息是："+e.getMessage());
            return "error";
        }
    }
}
