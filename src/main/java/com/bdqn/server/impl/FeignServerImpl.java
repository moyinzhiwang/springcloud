package com.bdqn.server.impl;

import com.bdqn.server.FeignServer;
import org.springframework.stereotype.Component;

@Component
public class FeignServerImpl  implements FeignServer {

    @Override
    public String testFeign(String name) {
        return "方法一报错";
    }
}
