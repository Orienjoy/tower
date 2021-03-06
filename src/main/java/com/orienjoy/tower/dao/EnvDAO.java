package com.orienjoy.tower.dao;

import com.orienjoy.tower.domain.Env;
import com.orienjoy.tower.dto.EnvDTO;

import java.util.List;

/**
 * Created by FEI on 2017/5/5.
 */
public interface EnvDAO {

    List selectAllEnv();

    List<EnvDTO> selectEnvById(Long envId);

}
