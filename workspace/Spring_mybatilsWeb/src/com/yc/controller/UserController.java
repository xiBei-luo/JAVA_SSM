package com.yc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.model.UserModel;
import com.yc.service.UserService;

@Controller
@RequestMapping("/jsp/user")
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping("/userList")
	public String list(Model m){
		List<UserModel> um=us.findAll();
		m.addAttribute("um", um);
		return "userList";
	}
	@RequestMapping(value="{operator_id}/del")
	public String del(@PathVariable int operator_id){
		System.out.println("ok");
		us.del(operator_id);
		System.out.println(operator_id+"„h³ý²Ù×÷");
		return "redirect:/jsp/user/userList";
	}
}
