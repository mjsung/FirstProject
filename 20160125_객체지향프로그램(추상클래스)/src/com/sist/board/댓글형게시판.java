package com.sist.board;

public class 댓글형게시판  extends 게시판{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("글쓰기를 한다");
		reply();
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public void reply()
	{
		System.out.println("댓글을 올린다");
	}
}
