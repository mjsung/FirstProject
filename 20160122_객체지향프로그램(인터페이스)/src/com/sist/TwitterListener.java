package com.sist;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

//Ʈ���Ϳ� �˻��� ������ �о��
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
	public void onStatus(Status s) { //������ �ҷ����� ��, �������� ������ ������ ��� �о��
		// TODO Auto-generated method stub
		String[] arr={s.getUser().getScreenName(),s.getText()}; //���̵�� ������ ��������
		//s.getCreatedAt(); //�Է��ѳ�¥��������
		//s.getFavoriteCount();//���ƿ��
		TwitterMain.model.addRow(arr);
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
