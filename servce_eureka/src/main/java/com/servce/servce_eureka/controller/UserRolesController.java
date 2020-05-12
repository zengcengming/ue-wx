package com.servce.servce_eureka.controller;
import com.servce.servce_eureka.core.Result;
import com.servce.servce_eureka.core.ResultGenerator;
import com.servce.servce_eureka.model.UserRoles;
import com.servce.servce_eureka.service.UserRolesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("/user/roles")
public class UserRolesController {
    @Resource
    private UserRolesService userRolesService;

    @PostMapping("/add")
    public Result add(UserRoles userRoles) {
        userRolesService.save(userRoles);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        userRolesService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserRoles userRoles) {
        userRolesService.update(userRoles);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        UserRoles userRoles = userRolesService.findById(id);
        return ResultGenerator.genSuccessResult(userRoles);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserRoles> list = userRolesService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
