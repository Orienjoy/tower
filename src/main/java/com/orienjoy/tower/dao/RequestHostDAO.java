package com.orienjoy.tower.dao;

import com.orienjoy.tower.domain.RequestHost;

/**
 * Created by Orienjoy on 2017/4/15.
 */
public interface RequestHostDAO {

    RequestHost selectByHostId(Long id);

}
