package com.orienjoy.tower.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.orienjoy.tower.dao.EnvDAO;
import com.orienjoy.tower.domain.Env;
import com.orienjoy.tower.service.IEnvService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by FEI on 2017/5/5.
 */
@Service("requestHostService")
public class EnvService implements IEnvService {
    private static Logger logger = LoggerFactory.getLogger(RequestHostService.class);

    @Resource
    private EnvDAO envDAO;

    @Override
    public JSONObject getEnvById(Long envId) {
        logger.info("getEnvById requestHostId = {}", envId);
        JSONObject json = new JSONObject();
        Env env = envDAO.selectEnvById(envId);

        return json;
    }
}