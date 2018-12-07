package com.acm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acm.bean.User;
import com.acm.dao.UserMapper;

/**
* @author 计算机网络软件应用1501 路素飞
* QQ 2512977541
* @version 创建时间：2018年12月6日 下午5:41:04
* 类说明
*/
@Service
public class UserService {
   
	@Autowired
	UserMapper userMapper;
	
	public User findUser(String id) {
		return null;
	}
}
