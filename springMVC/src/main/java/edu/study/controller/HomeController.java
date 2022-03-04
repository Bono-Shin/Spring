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

//ioc�� ��ü�� ������ �ϴµ� ��Ʈ�ѷ��� ����� �̰������� request mapping�� ����
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//�� �������� �⺻��������.
	//�������� ������̼ǰ� ���� ���� (=�����θ� ã���ش�)
	//���� ��� �ϳ��� �޼ҵ� �ϳ�
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//�����͸� ������ �� model ��ü ���
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		//return�ϴ� �������� ã�´�. (=home.jsp�� ã�´�)
		//�������� web-inf ���� home.jsp �� ã�´�.
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		
		return "login/login";
	}
	
}