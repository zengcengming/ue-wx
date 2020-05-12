package com.servce.servce_eureka.service.impl;

import com.servce.servce_eureka.dao.TUserMapper;
import com.servce.servce_eureka.model.TUser;
import com.servce.servce_eureka.service.TUserService;
import com.servce.servce_eureka.core.AbstractService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
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
public class TUserServiceImpl extends AbstractService<TUser> implements TUserService,UserDetailsService{
    @Resource
    private TUserMapper tUserMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        TUser tUser=tUserMapper.selectOne(new TUser(null,userName,null));
        if(null==tUser){
            throw new UsernameNotFoundException("用户名 "+userName+"不存在");
        }




        //获取用户权限
        /*List<GrantedAuthority> authorities = new ArrayList<>();
        List<School> jurisdictions = schoolMapper.selectAll();
        for(School item : jurisdictions) {
            GrantedAuthority authority = new MyGrantedAuthority();
            authorities.add(authority);
        }
        TUser tUser1 = new TUser(tUser.getName(),user.getPassword(),authority);
        tUser.setAuthorities(authorities);*/
        return tUser;
    }


}
