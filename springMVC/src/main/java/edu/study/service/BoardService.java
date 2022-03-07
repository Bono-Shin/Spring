package edu.study.service;

import java.util.List;

import edu.study.vo.BoardVO;
import edu.study.vo.SearchVO;

public interface BoardService {

	//추상메소드를 사용해서 dao에서 데이터를 추출해서 반환할 것이다.
	List<BoardVO> list(SearchVO vo) throws Exception;
	
	BoardVO detail(int bidx) throws Exception;
	
	BoardVO modify(int bidx) throws Exception; //detail로 재사용 해도 무관
	
	int update(BoardVO vo) throws Exception;
	
	int delete(int bidx) throws Exception;
	
	int insert(BoardVO vo) throws Exception;
}
