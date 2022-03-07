package edu.study.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.study.vo.BoardVO;
import edu.study.vo.SearchVO;

//component ������ �ִ� ������̼�
//�ΰ������� ��� ��ü (�ܺο� �ִ� �����Ϳ� ���� ��)
@Repository
public class BoardDAO {

	@Autowired
	private SqlSession sqlSession; //root-context�� bean���� ��� �ص��� (executeQuery ���� �����ϰ� ���� �����ϰ� ����)
											//mapper �̸�
	private static final String Namespace = "edu.study.mapper.boardMapper";
	
	public List<BoardVO> list(SearchVO vo) throws Exception{
		
											//mapper�� �ִ� ������ id
		return sqlSession.selectList(Namespace+".listBoard",vo);
	}
	
	public BoardVO detail(int bidx) throws Exception{
		return sqlSession.selectOne(Namespace+".detailBoard",bidx);
	}
	
	public BoardVO modify(int bidx) throws Exception{
		return sqlSession.selectOne(Namespace+".modifyBoard",bidx);
	}
	
	public int update(BoardVO vo) throws Exception{
		return sqlSession.update(Namespace+".updateBoard",vo);
	}
	
	public int delete(int bidx) throws Exception{
		return sqlSession.update(Namespace+".deleteBoard",bidx);
	}
	
	public int insert(BoardVO vo) throws Exception{
		return sqlSession.insert(Namespace+".insertBoard",vo);
	}
}

