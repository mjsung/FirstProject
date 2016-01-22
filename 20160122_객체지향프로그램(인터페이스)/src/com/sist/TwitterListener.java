package com.sist;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

//트위터에 검색한 내용을 읽어옴
public class TwitterListener implements StatusListener {

	@Override
	public void onException(Exception e) {
		// TODO Auto-generated method stub
		System.out.println(e.getMessage());
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onScrubGeo(long arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStallWarning(StallWarning arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatus(Status s) { //데이터 불러오는 곳, 쓰레드임 종료명령 전까지 계속 읽어옴
		// TODO Auto-generated method stub
		String[] arr={s.getUser().getScreenName(),s.getText()}; //아이디와 데이터 가져오기
		//s.getCreatedAt(); //입력한날짜가져오기
		//s.getFavoriteCount();//좋아요수
		TwitterMain.model.addRow(arr);
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
