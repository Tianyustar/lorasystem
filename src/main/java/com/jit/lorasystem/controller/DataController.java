package com.jit.lorasystem.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author libre
 * @since 2018-04-18
 */
@RestController
@RequestMapping("/data")
public class DataController {

    @RequestMapping("test")
    public String test() {
        return "success test";
    }

}

