package com.orienjoy.tower.service.impl;

import com.orienjoy.tower.dao.EnvDAO;
import com.orienjoy.tower.dto.EnvDTO;
import com.orienjoy.tower.service.IEnvService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FEI on 2017/5/5.
 */
@Service("envService")
public class EnvService implements IEnvService {
    private static Logger logger = LoggerFactory.getLogger(EnvService.class);

    @Resource
    private EnvDAO envDAO;

    @Override
    public List<EnvDTO> getEnvById(Long envId) {
        logger.info("getEnvById envId = {}", envId);
        return envDAO.selectEnvById(envId);
    }
}