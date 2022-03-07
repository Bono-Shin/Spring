package edu.study.service;

import java.util.List;

import edu.study.vo.BoardVO;
import edu.study.vo.SearchVO;

public interface BoardService {

	//�߻�޼ҵ带 ����ؼ� dao���� �����͸� �����ؼ� ��ȯ�� ���̴�.
	List<BoardVO> list(SearchVO vo) throws Exception;
	
	BoardVO detail(int bidx) throws Exception;
	
	BoardVO modify(int bidx) throws Exception; //detail�� ���� �ص� ����
	
	int update(BoardVO vo) throws Exception;
	
	int delete(int bidx) throws Exception;
	
	int insert(BoardVO vo) throws Exception;
}
