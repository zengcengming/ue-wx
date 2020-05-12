package com.servce.servce_eureka.service.impl;

import com.servce.servce_eureka.dao.RoleMapper;
import com.servce.servce_eureka.model.Role;
import com.servce.servce_eureka.service.RoleService;
import com.servce.servce_eureka.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/05/12.
 */
@Service
@Transactional
public class RoleServiceImpl extends AbstractService<Role> implements RoleService {
    @Resource
    private RoleMapper roleMapper;

}
