package demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.po.User;
@Controller
public class UserController {
	
	/**
	 * 向用户注册页面跳转
	 */
	@RequestMapping("/toRegister")
	public String toRegister( ) {
	    return "register";
	}
	/**
	 * 接收用户注册信息
	 */
	
	public String registerUser(User user) {
	    String  username = user.getUsername();
	    String password = user.getPassword();
	    System.out.println("username="+username);
	    System.out.println("password="+password);
	    return "success";
	}

	

}
