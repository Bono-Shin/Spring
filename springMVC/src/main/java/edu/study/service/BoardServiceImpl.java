package edu.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.study.dao.BoardDAO;
import edu.study.vo.BoardVO;
import edu.study.vo.SearchVO;

//ioc �����̳ʰ� ��ü�� ���� �����Ѵ�
//�������̽��� ���� ��ü
@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> list(SearchVO vo) throws Exception {

		//dao�� ��û�� ����
		List<BoardVO> list = boardDAO.list(vo);
		
		return list;
	}

	@Override
	public BoardVO detail(int bidx) throws Exception {

		return boardDAO.detail(bidx);
	}

	@Override
	public BoardVO modify(int bidx) throws Exception {
		
		return boardDAO.modify(bidx);
	}

	@Override
	public int update(BoardVO vo) throws Exception {
		
		return boardDAO.update(vo);
	}

	@Override
	public int delete(int bidx) throws Exception {
		
		return boardDAO.delete(bidx);
	}

	@Override
	public int insert(BoardVO vo) throws Exception {
	
		return boardDAO.insert(vo);
	}

}
