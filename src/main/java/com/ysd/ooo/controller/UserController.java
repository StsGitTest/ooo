package com.ysd.ooo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysd.ooo.entity.City;
import com.ysd.ooo.entity.Result;
import com.ysd.ooo.entity.User;
import com.ysd.ooo.service.CityService;
import com.ysd.ooo.service.UserService;
import com.ysd.ooo.util.Cors;

@Controller
@RequestMapping("/user")
public class UserController extends Cors {

	@Autowired
	UserService userservice;

	@Autowired
	CityService cityservice;

	@RequestMapping("/haha")
	@ResponseBody
	public List<City> select() {
		return cityservice.selectcity();
	}

	@RequestMapping("/add")
	@ResponseBody
	public int add() {
		City c = new City(4, "张三", "河南省鹤壁");
		return cityservice.insert(c);
	}

	@RequestMapping("/upda")
	@ResponseBody
	public int upda() {
		City c = new City();
		c.setProvinceId(4);
		c.setId(3);
		c.setCityName("papap");
		c.setDescription("哈哈哈哈哈");
		return cityservice.update(c);
	}

	@RequestMapping("/date")
	@ResponseBody
	public int date() {

		return cityservice.delete(1);
	}

	/**
	 * 登陆实体控制器
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Result login(String username, String userpassword) {

		User user = userservice.selectuser(username);

		if (user.getUserpassword().equals(userpassword)) {
			// 密码相同准许登陆
			return new Result(true, "登陆成功", null);
		} else {
			return new Result(false, "登陆失败", null);
		}

	}

}
