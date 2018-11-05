package demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.dao.PersonDao;
import demo.po.Person;

/**
 * 控制器类
 */
@Controller
@RequestMapping(value="/person")
public class PersonController {
	//@Resource(name="personDao")
	@Autowired
	private PersonDao personDao;
	@RequestMapping(value = "/listAll")
	public String hello11(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		List<Person> listAll=personDao.listAll();
		request.setAttribute("personList", listAll);
				
		return "/person/personlist.jsp";
	}

	

	
	
	


}
