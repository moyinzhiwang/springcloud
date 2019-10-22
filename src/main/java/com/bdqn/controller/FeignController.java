package com.bdqn.controller;

import com.bdqn.server.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignServer feignService;
    @RequestMapping("/test1")
    public String test(@RequestParam("name") String name){
        return feignService.testFeign(name);
    }


}
