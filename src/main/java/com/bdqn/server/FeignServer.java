package com.bdqn.server;

import com.bdqn.server.impl.FeignServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "PRODUCER",fallback = FeignServerImpl.class)
public interface FeignServer {

    @RequestMapping("/test1")
    public String testFeign(@RequestParam("name") String name);

}
