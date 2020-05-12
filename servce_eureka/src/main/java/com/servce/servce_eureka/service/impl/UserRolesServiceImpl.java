package com.servce.servce_eureka.service.impl;

import com.servce.servce_eureka.dao.UserRolesMapper;
import com.servce.servce_eureka.model.UserRoles;
import com.servce.servce_eureka.service.UserRolesService;
import com.servce.servce_eureka.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/05/12.
 */
@Service
@Transactional
public class UserRolesServiceImpl extends AbstractService<UserRoles> implements UserRolesService {
    @Resource
    private UserRolesMapper userRolesMapper;

}
