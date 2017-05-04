package com.orienjoy.tower.service;

import com.alibaba.fastjson.JSONObject;
import com.orienjoy.tower.domain.Env;

/**
 * Created by FEI on 2017/5/5.
 */
public interface IEnvService {

    JSONObject getEnvById(Long id);

    Env getEnvById(Long id);

}
