package com.server;
import com.common.Function;
/*
 *  ��Ű���� �ٸ��� public�ܿ��� ������ �� ����.
 */
public class Server {
	public void start()
	{
		System.out.println("��������...");
	}
	public void accept()
	{
		System.out.println("Ŭ���̾�Ʈ ����...");
	}
	public void readwrite(int type)
	{
		switch(type)
		{
		case Function.LOGIN:
			System.out.println("�α��� ó���Ϸ�");
			break;
		case Function.MAKEROOM:
			System.out.println("�游��� ó���Ϸ�");
			break;
		case Function.GAME:
			System.out.println("���� ��û ó���Ϸ�");
			break;
		case Function.CHATMESSAGE:
			System.out.println("ä�� ó���Ϸ�");
			break;
		case Function.CHATEND:
			System.out.println("����");
			break;
		}
	}
	public void end()
	{
		System.out.println("���� ����");
	}
}
