package com.jt.dubbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.jt.dubbo.mapper.UserMapper;
import com.jt.dubbo.pojo.User;
@Service //必须使用dubbo注解	
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		
		return userMapper.selectList(null);
	}

	@Override
	public String getMsg() {
		
		return "我是第一台9002提供者";
	}
}
