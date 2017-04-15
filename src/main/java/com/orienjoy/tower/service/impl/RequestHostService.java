package com.orienjoy.tower.service.impl;

import com.orienjoy.tower.dao.RequestHostDAO;
import com.orienjoy.tower.domain.RequestHost;
import com.orienjoy.tower.service.IRequestHostService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.Override;

/**
 * Created by Orienjoy on 2017/4/15.
 */
@Service("requestHostService")
public class RequestHostService implements IRequestHostService {
    private static Logger logger = LoggerFactory.getLogger(RequestHostService.class);

    @Resource
    private RequestHostDAO requestHostDao;

    @Override
    public RequestHost getRequestHostById(Long id) {
        logger.info("getRequestHostById requestHostId = {}",id);
        return requestHostDao.selectById(id);
    }

}
