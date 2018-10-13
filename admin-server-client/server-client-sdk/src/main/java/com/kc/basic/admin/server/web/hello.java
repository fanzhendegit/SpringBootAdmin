package com.kc.basic.admin.server.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @author fanzhen
 * @date2018-10-13-11:43
 */
@RestController
@RequestMapping(value = "/client")
public class hello {
    private static final Logger LOGGER = LoggerFactory.getLogger(hello.class);
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String index(@PathVariable String name) {
        LOGGER.info("request one/two  name is "+name);
        return "hello "+name+"，this is first messge";
    }
}
