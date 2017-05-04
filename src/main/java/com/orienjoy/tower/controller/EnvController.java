package com.orienjoy.tower.controller;

import com.alibaba.fastjson.JSONObject;
import com.orienjoy.tower.service.IEnvService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by FEI on 2017/5/5.
 */
@RestController
public class EnvController {

    @Resource
    private IEnvService envService;

    private static Logger logger = LoggerFactory.getLogger(IEnvService.class);

    // 读取env参数
    @RequestMapping(value = "/env/{env}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject getEnvById(HttpServletResponse response, @PathVariable("envId") Long envId){
        logger.info("Request URL = {} ", envId);
        JSONObject json = new JSONObject();
        json = envService.getEnvById(envId);
        return json;
    }
}

