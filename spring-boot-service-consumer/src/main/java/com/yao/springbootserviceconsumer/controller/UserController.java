package com.yao.springbootserviceconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @className UserController
 * @description: TODO
 * @author: yaoyao
 * @create: 2019/11/11 15:17
 */
@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {
    @RequestMapping(value = "/getUser")
    public Map<String,Object> getUser(@RequestParam Integer id){
      log.info("请求参数>>>"+id);
      Map map = new HashMap(16);
      map.put("name","yy");
      map.put("age",12);
      log.info("返回参数<<<"+map);
      return map;
    }
}
