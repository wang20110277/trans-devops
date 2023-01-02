package com.trans.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "配置测试")
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${config.info}")
    public String configInfo;

    @GetMapping("/nacos/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
