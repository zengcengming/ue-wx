package com.servce.servce_eureka.service.impl;

import com.servce.servce_eureka.dao.TAcTokenMapper;
import com.servce.servce_eureka.model.TAcToken;
import com.servce.servce_eureka.service.TAcTokenService;
import com.servce.servce_eureka.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/30.
 */
@Service
@Transactional
public class TAcTokenServiceImpl extends AbstractService<TAcToken> implements TAcTokenService {
    @Resource
    private TAcTokenMapper tAcTokenMapper;

}
