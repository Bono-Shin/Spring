package edu.study.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

//ioc가 객체를 만들기는 하는데 컨트롤러로 만든다 이곳에서만 request mapping을 뒤짐
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//이 페이지가 기본페이지다.
	//웹서블릿 어노테이션과 같은 역할 (=가상경로를 찾아준다)
	//가상 경로 하나당 메소드 하나
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//데이터를 전달할 때 model 객체 사용
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		//return하는 페이지를 찾는다. (=home.jsp를 찾는다)
		//페이지를 web-inf 안의 home.jsp 를 찾는다.
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		
		return "login/login";
	}
	
}
