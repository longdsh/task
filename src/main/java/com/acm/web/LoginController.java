package com.acm.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acm.bean.Message;
import com.acm.bean.User;

/**
* @author 计算机网络软件应用1501 路素飞
* QQ 2512977541
* @version 创建时间：2018年12月7日 下午5:04:16
* 类说明
*/
@Controller
@RequestMapping("login")
public class LoginController {
   
	@RequestMapping("/login")
	@ResponseBody
	public Message Login(HttpServletRequest request,User user) {
		request.getSession().setAttribute("user", user);
		return Message.success().add("type", "admin");
	}
}
