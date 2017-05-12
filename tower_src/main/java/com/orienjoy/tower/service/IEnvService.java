package com.orienjoy.tower.service;

import com.orienjoy.tower.domain.Env;
import com.orienjoy.tower.dto.EnvDTO;

import java.util.List;

/**
 * Created by FEI on 2017/5/5.
 */
public interface IEnvService {

    List getAllEnvName();

    List<EnvDTO> getEnvById(Long envId);

}
