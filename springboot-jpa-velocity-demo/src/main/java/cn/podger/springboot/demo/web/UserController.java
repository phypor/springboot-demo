package cn.podger.springboot.demo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.podger.springboot.demo.entity.User;
import cn.podger.springboot.demo.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/test")
	@ResponseBody
	String test() {
		return "Hello World!";
	}

	@RequestMapping("/index")
	String index() {
		return "index";
	}

	@ResponseBody
	@RequestMapping("/getById")
	Map<String, Object> jsonTest(Model model, long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", userRepository.findOne(id));
		return map;
	}

	@ResponseBody
	@RequestMapping("/add")
	Map<String, Object> jsonTest(Model model, String name, String age) {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = new User();
		user.setAge(age);
		user.setName(name);
		userRepository.save(user);
		map.put("result", user);
		return map;
	}

}