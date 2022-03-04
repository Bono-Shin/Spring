package edu.study.service;

import java.util.List;

import edu.study.vo.BoardVO;

public interface BoardService {

	//�߻�޼ҵ带 ����ؼ� dao���� �����͸� �����ؼ� ��ȯ�� ���̴�.
	List<BoardVO> list() throws Exception;
	
	BoardVO detail(int bidx) throws Exception;
	
	BoardVO modify(int bidx) throws Exception;
}
