package com.orienjoy.tower.controller;

import com.alibaba.fastjson.JSONObject;
import com.orienjoy.tower.service.IRequestHostService;
import com.orienjoy.tower.service.impl.RequestHostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Orienjoy on 2017/4/15.
 */
@RestController
public class RequestHostController {

    @Resource
    private IRequestHostService requestHostService;

    private static Logger logger = LoggerFactory.getLogger(RequestHostService.class);

    // 读取env参数
    @RequestMapping(value = "/host/{host}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject getRequestHostById(HttpServletResponse response, @PathVariable("requestHostId") Long requestHostId){
        logger.info("Request URL = {} ", requestHostId);
        JSONObject json = new JSONObject();

        return json;
    }
}
