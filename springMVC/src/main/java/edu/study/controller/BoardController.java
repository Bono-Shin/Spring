package edu.study.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.study.service.BoardService;
import edu.study.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */

@RequestMapping(value="/board") //중복되는 경로 설정
@Controller
public class BoardController {
	
	@Autowired
			//타입은 인터페이스
	private BoardService boardService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//이 페이지가 기본페이지다.
	//웹서블릿 어노테이션과 같은 역할 (=가상경로를 찾아준다)
	//가상 경로 하나당 메소드 하나
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Locale locale, Model model) throws Exception{
		
		List<BoardVO> list = boardService.list();
		
		model.addAttribute("list",list);
		
		return "board/list";
	}
	
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String view(Locale locale, Model model, int bidx) throws Exception{
		
		System.out.println(bidx);
		
		BoardVO vo = boardService.detail(bidx);
		
		model.addAttribute("vo",vo);
		
		return "board/view";
	}
	
	@RequestMapping(value = "/modify.do", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, int bidx) throws Exception{
		
		BoardVO vo = boardService.modify(bidx);
		
		model.addAttribute("vo",vo);
		
		return "board/modify";
	}

	
}
