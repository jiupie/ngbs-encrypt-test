package com.wl.web;

import com.wl.core.encrypt.annotation.SeparateEncrypt;
import com.wl.po.People;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 南顾北衫
 */

@RestController
public class SignController {

    @SeparateEncrypt
    @PostMapping("/sign")
    public String hello(@RequestBody People people) {
        if (people.getSex() == 1) {
            return people.getName() + "先生,你好！";
        } else {
            return people.getName() + "女士,你好！";
        }
    }
}
