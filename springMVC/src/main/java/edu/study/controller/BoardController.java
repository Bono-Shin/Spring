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
import edu.study.vo.SearchVO;

/**
 * Handles requests for the application home page.
 */

@RequestMapping(value="/board") //중복되는 경로 설정 (이 컨트롤러로 들어오기 위한 기본 가상경로 설정)
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
	public String list(Locale locale, Model model, SearchVO vo) throws Exception{
		
		List<BoardVO> list = boardService.list(vo);
		
		model.addAttribute("list",list);
		
		return "board/list";
	}
														//get, post 방식 (지우면 모든 방식을 받음)
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String view(Locale locale, Model model, int bidx) throws Exception{
													//parsing을 자동으로 해서 가져옴
		System.out.println(bidx);
		
		BoardVO vo = boardService.detail(bidx);
		
		//데이터를 담고 있는 그릇 = model -> 알아서 request에 담음
		model.addAttribute("vo",vo);
		
		return "board/view";
	}
	
	@RequestMapping(value = "/modify.do", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, int bidx) throws Exception{
		
		BoardVO vo = boardService.modify(bidx);
		
		model.addAttribute("vo",vo);
		
		return "board/modify";
	}
														//post 방식이므로 같은 함수이름을 쓰고 오버라이딩으로 처리
	@RequestMapping(value = "/modify.do", method = RequestMethod.POST)
	public String modify(Locale locale, Model model, BoardVO vo) throws Exception{
		
		boardService.update(vo);
		
		//스프링에서 리다이렉트
		return "redirect:/board/view.do?bidx="+vo.getBidx();
	}

	@RequestMapping(value = "/delete.do", method = RequestMethod.POST)
	public String delete(Locale locale, Model model, int bidx) throws Exception{
		
		boardService.delete(bidx);
		
		return "redirect:/board/list.do";
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) throws Exception{
		
		return "board/insert";
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public String insert(Locale locale, Model model, BoardVO vo) throws Exception{
		
		boardService.insert(vo);
		
		return "redirect:/board/view.do?bidx="+vo.getBidx();
	}
	
}
