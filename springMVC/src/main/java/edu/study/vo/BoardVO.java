package edu.study.vo;

public class BoardVO {
	//�����ͺ��̽��� column ��� �ʵ� ���� ������� �Ѵ�
	//���� �˾Ƽ� ���Խ�Ű�� ����
	private int bidx;
	private String subject;
	private String content;
	private String writer;
	
	public int getBidx() {
		return bidx;
	}
	public void setBidx(int bidx) {
		this.bidx = bidx;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
