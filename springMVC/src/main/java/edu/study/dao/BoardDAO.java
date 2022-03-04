package edu.study.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.study.vo.BoardVO;

//부가정보를 담는 객체 (외부에 있는 데이터와 연결 됨)
@Repository
public class BoardDAO {

	@Autowired
	private SqlSession sqlSession; //root-context에 bean으로 등록 해뒀음 (executeQuery 개념 연결하고 쿼리 실행하고 닫음)
											//mapper 이름
	private static final String Namespace = "edu.study.mapper.boardMapper";
	
	public List<BoardVO> list() throws Exception{
		
											//mapper에 있는 쿼리문 id
		return sqlSession.selectList(Namespace+".listBoard");
	}
	
	public BoardVO detail(int bidx) throws Exception{
		return sqlSession.selectOne(Namespace+".detailBoard",bidx);
	}
	
	public BoardVO modify(int bidx) throws Exception{
		return sqlSession.selectOne(Namespace+".modifyBoard",bidx);
	}
}

