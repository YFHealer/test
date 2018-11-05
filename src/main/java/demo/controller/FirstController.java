package demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 */
@Controller
@RequestMapping(value="/hello")
public class FirstController {
	@RequestMapping(value = "/first")
	public String hello11(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		
		request.setAttribute("msg", "nihao");
				
		return "first";
	}

	@RequestMapping(value = "/demo1")
	public String demo1() {

		return "first";
	}

	
	
	


}
