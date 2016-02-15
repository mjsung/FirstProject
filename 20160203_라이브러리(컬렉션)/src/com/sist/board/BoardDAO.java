package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardDAO {
   private static List<BoardDTO> boardList
             = new ArrayList<BoardDTO>();
   private static List<ReplyDTO> replyList
             = new ArrayList<ReplyDTO>();
   
   static
   {
	   try{
		   File file=new File("c:\\image\\board.txt");
		   if(file.exists())
		   {
			   file.createNewFile(); //파일이 존재하지 않는다면 파일을 만들어라!
		   }
		   ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
		   boardList=(ArrayList<BoardDTO>)ois.readObject();
		   ois.close(); //저장했다가 읽어들일 때
	   }catch(Exception ex){}
   }
   // 게시물 목록 출력   ==> get
   public ArrayList<BoardDTO> boardALLData(int page)
   {
	   ArrayList<BoardDTO> list=new ArrayList<BoardDTO>();
	   int j=0; //10개씩 출력하는 변수
	   int k=0;
	   int pagecnt=(page*10-10);
	   for(int i=boardList.size()-1;i>=0;i--)
	   {
		   BoardDTO d=boardList.get(i);
		   if(j<10 && k>=pagecnt)
		   {
			   list.add(d);
			   j++;
		   }
		   k++;
	   }
	   return list;   
   }
   // 게시물 등록  ==> add
   public void boardInsert(BoardDTO d)
   {
	   d.setNo(noSequence());
	   d.setRegdate(new Date());
	   d.setHit(0);
	   boardList.add(d);
   }
   // 내용보기 => 댓글 출력
   public BoardDTO boardContent(int no)
   {
	   BoardDTO d=new BoardDTO();
	   for(BoardDTO dd:boardList)
	   {
		   if(dd.getNo()==no)
		   {
			   d=dd;
			   d.setHit(dd.getHit()+1); //조회수 증가
			   break;
		   }
	   }
	  
	return d;
   }
   // 수정  ==> set
   public boolean boardUpdate(BoardDTO d)
   {
	   boolean bCheck=false;
	   for(int i=0;i<boardList.size();i++)
	   {
		   BoardDTO dd=boardList.get(i);
		   if(d.getNo() == dd.getNo())			   
		   {
			   if(d.getPwd().equals(dd.getPwd()))
			   {
				   bCheck=true;
				   d.setHit(dd.getHit());
				   d.setRegdate(dd.getRegdate());
				   boardList.set(i, d);
				   break;
			   }
				   
		   }
	   }
	   return bCheck;
	   
   }
   // 삭제  ==> remove
   public boolean boardDelete(int no, String pwd)
   {
	   boolean bCheck=false;
	   for(int i=0;i<boardList.size();i++)
	   {
		   BoardDTO d=boardList.get(i);
		   if(d.getNo() ==no)
		   {
			   if(d.getPwd().equals(pwd))
			   {
				   bCheck=true;
				   boardList.remove(i);
				   break;
			   }
		   }
	   }
	   return bCheck;
	   
   }
   // 댓글 수정 ==> set
   // 댓글 삭제  ==> remove
   // 찾기 ==> get
   // 전체 삭제 ==> clear
   // 크기 ==> size() : 페이지 나누기 
   public int boardTotalPage()
   {
	   return (int)(Math.ceil(boardList.size()/10.0));
   }
   public int noSequence() //자동증가번호 sequence-> 자동게시판번호
   {
	   int no=0;
	   for(BoardDTO d:boardList)
	   {
		   if(no<d.getNo())
		   {
			   no=d.getNo();
		   }
	   }
	   return no+1;
   }
public static List<BoardDTO> getBoardList() {
	return boardList;
}
public static void setBoardList(List<BoardDTO> boardList) {
	BoardDAO.boardList = boardList;
}
public static List<ReplyDTO> getReplyList() {
	return replyList;
}
public static void setReplyList(List<ReplyDTO> replyList) {
	BoardDAO.replyList = replyList;
}
   
}
