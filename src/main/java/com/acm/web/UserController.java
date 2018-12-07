package com.acm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acm.bean.User;

/**
* @author 计算机网络软件应用1501 路素飞
* QQ 2512977541
* @version 创建时间：2018年12月6日 下午5:38:13
* 类说明
*/
@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("/login")
	public void Login(User user) {
		System.out.println(user.getId());
		//return ""
	}

}
