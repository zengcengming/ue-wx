package com.servce.servce_eureka.controller;
import com.servce.servce_eureka.model.Role;
import com.servce.servce_eureka.service.RoleService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/05/12.
*/
@Transactional
@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleService roleService;

}
