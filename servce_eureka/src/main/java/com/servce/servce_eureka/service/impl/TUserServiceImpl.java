package com.servce.servce_eureka.service.impl;

import com.servce.servce_eureka.dao.TUserMapper;
import com.servce.servce_eureka.model.TUser;
import com.servce.servce_eureka.service.TUserService;
import com.servce.servce_eureka.core.AbstractService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/30.
 */
@Service
@Component
@Transactional
public class TUserServiceImpl extends AbstractService<TUser> implements TUserService {
    @Resource
    private TUserMapper tUserMapper;

}
