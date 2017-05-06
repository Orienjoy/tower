package com.orienjoy.tower.controller;

import com.orienjoy.tower.dto.EnvDTO;
import com.orienjoy.tower.service.IEnvService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FEI on 2017/5/5.
 */
@RestController
@RequestMapping("/env")
public class EnvController {

    @Resource
    private IEnvService envService;

    private static Logger logger = LoggerFactory.getLogger(IEnvService.class);

    // 读取env参数
    @RequestMapping(value = "/getEnvById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<EnvDTO> getEnvById(@RequestParam(required = true) Long envId) throws Exception {
        logger.info("Request URL = {} ", envId);
        return envService.getEnvById(envId);
    }
}

