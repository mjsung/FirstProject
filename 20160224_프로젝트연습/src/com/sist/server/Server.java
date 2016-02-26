package com.sist.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.sist.common.Function;
import com.sist.server.Server.Client;


public class Server implements Runnable{
    // ���� ���� 
	ServerSocket ss;
	// port
	final int PORT=3355;
	// ������ ������ ���� 
	Vector<Client> waitVc=new Vector<Client>();
	// �������� ���� 
	Vector<Room>  roomVc=new Vector<Room>();
	public Server()
	{
		try
		{
			
			ss=new ServerSocket(PORT);
			/*
			 *   bind()
			 *   listen()
			 */
			System.out.println("Server Start...");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	// ���ӽ� ==> ������ ���� (��ſ���)
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				// s=> client�� ����(ip,port)
				// Thread�� ���� => ��� 
				Client client=new Client(s);
				client.start();
				// ��Ž��� 
			}
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server server=new Server();
        new Thread(server).start();
	}
	// ��� => Server�� ��系���� ���� : ����Ŭ���� 
    class Client extends Thread
    {
    	String id,pos;
    	boolean bCheck;
    	// ��� 
    	Socket s;
    	BufferedReader in;
    	OutputStream out;
    	public Client(Socket s)
    	{
    		try
    		{
    			this.s=s;
    			in=new BufferedReader(
    					new InputStreamReader(
    							s.getInputStream()));
    			out=s.getOutputStream();
    		}catch(Exception ex){}
    	}
    	// ��� 
    	public void run()
    	{
    		try
    		{
    			while(true)
    			{
    				// Ŭ���̾�Ʈ => ��û���� �޴´�
    				String msg=in.readLine();
    				StringTokenizer st=
    					new StringTokenizer(msg, "|");
    				// 100|id|sex|name|avata
    				int protocol=Integer.parseInt(st.nextToken());
    				switch(protocol)
    				{
	    				case Function.LOGIN:
	    				{
	    					id=st.nextToken();
	    					pos="����";
	    					// ������ �������� �޼��� ���� 
	    					messageAll(Function.LOGIN+"|"+id+"|"+pos);
	    					// ������ �߰�
	    					waitVc.addElement(this);
	    					messageTo(Function.MYLOG+"|"+id);
	    					// ������ ���� ���� 
	    					for(Client client:waitVc)
	    					{
	    						messageTo(Function.LOGIN+"|"
	    								+client.id+"|"
	    								+client.pos);
	    					}
	    					// ������ 
	    					for(Room room:roomVc)
	    					{
	    						messageTo(Function.MAKEROOM+"|"
		    							+room.roomName+"|"
		    							+room.current+"/"+room.inwon);
	    					}
	    				}
	    				break;
	    				
	    				case Function.CHATEND:
	    				{
	    					
	    				}
	    				break;
	    				case Function.MAKEROOM:
	    				{
	    					Room room=new Room(st.nextToken(),
	    							Integer.parseInt(st.nextToken()));
	    					messageAll(Function.MAKEROOM+"|"
	    							+room.roomName+"|"
	    							+room.current+"/"+room.inwon);
	    					pos=room.roomName;
	    					room.roomJJang=id;
	    					
	    					room.userVc.addElement(this);
	    					roomVc.addElement(room);
	    					
	    					messageTo(Function.MYROOMIN+"|"+id+"|"+room.roomName+"|"+room.roomJJang);
	    					messageAll(Function.ROOMUPDATE+"|"
	    					      +id+"|"+pos);
	    				}
	    				break;
	    				case Function.MYROOMIN:
	    				{
	    					/*
	    					 *   1. ���� ã��
	    					 *   2. ��ġ����
	    					 *   3. �����ο� ���� 
	    					 *   4. �� �ִ� ���
	    					 *      = ���� ����� ����
	    					 *      = ����޼��� 
	    					 *   5. ���� ���
	    					 *      = ����=>ä�ù����� ����
	    					 *      = �� �ִ� ������� ���� 
	    					 *   6. ����
	    					 */
	    					String rn=st.nextToken();
	    					for(Room room:roomVc)
	    					{
	    						if(rn.equals(room.roomName))
	    						{
	    							room.current++;
	    							pos=room.roomName;
	    							for(Client client:room.userVc)
	    							{
	    								client.messageTo(Function.ROOMCHAT
	    										+"|[�˸� ��"+id+"���� �����ϼ̽��ϴ�]");
	    								client.messageTo(Function.ROOMIN+"|"
	    		   							     +id+"|"
	    		   							     +room.roomJJang);
	    								client.messageTo(Function.GAMEINIT+"|");	
	    							}
	    							// ���� ��� ó��
	    							messageTo(Function.MYROOMIN+"|"
	   	   							     +id+"|"
	   	   							     +room.roomName+"|"
	   	   							     +room.roomJJang);
	    							room.userVc.addElement(this);
	    							for(Client client:room.userVc)
	    							{
	    								if(!id.equals(client.id))
	    								{
	    									messageTo(Function.ROOMIN+"|"
		    		   							     +client.id+"|"
		    		   							     +room.roomJJang);
	    									messageTo(Function.GAMEINIT+"|");	
	    								}
	    							}
	    							messageAll(Function.WAITUPDATE+"|"
	    									+room.roomName+"|"
	    									+room.current+"|"
	    									+room.inwon+"|"
	    									+id+"|"
	    									+pos);
	    						}
	    					}
	    				}
	    				break;
	    				case Function.ROOMOUT:
	    				{
	    					
	    				}
	    				break;
	    				case Function.GAMEREADY:
	    				{
	    					String rn=st.nextToken();
	    					for(int i=0;i<roomVc.size();i++)
	    					{
	    						Room room=roomVc.elementAt(i);
	    						if(rn.equals(room.roomName))
	    						{
	    							for(int j=0;j<room.userVc.size();j++)
	    							{
	    								Client client=room.userVc.elementAt(j);
	    								if(client.id.equals(id))
	    								{
	    									bCheck=true;
	    								}
	    							}
	    							if(room.userVc.elementAt(0).bCheck==true 
	    								&& room.userVc.elementAt(1).bCheck==true)
	    							{
	    								for(int j=0;j<room.userVc.size();j++)
		    							{
		    								Client client=room.userVc.elementAt(j);
		    								client.messageTo(Function.GAMEREADY+"|"+room.roomJJang);
		    							}
	    							}
	    						}
	    					}
	    				}
	    				break;
	    				case Function.GAMESTART:
	    				{
	    					String rn=st.nextToken();
	    					for(int i=0;i<roomVc.size();i++)
	    					{
	    						Room room=roomVc.elementAt(i);
	    						if(rn.equals(room.roomName))
	    						{
	    							for(int j=0;j<room.userVc.size();j++)
	    							{
	    								Client client=room.userVc.elementAt(j);
	    								if(client.id.equals(id))
	    								{
	    									client.messageTo(Function.GAMESTART+"|true");
	    								}
	    								else
	    								{
	    									client.messageTo(Function.GAMESTART+"|false");
	    								}
	    							}
	    							
	    						}
	    					}
	    				}
	    				break;
	    				case Function.GAMETURN:
	    				{
	    					String rn=st.nextToken();
	    					String yid=st.nextToken();
	    					String no=st.nextToken();
	    					String x=st.nextToken();
	    					String y=st.nextToken();
	    					for(int i=0;i<roomVc.size();i++)
	    					{
	    						Room room=roomVc.elementAt(i);
	    						if(rn.equals(room.roomName))
	    						{
	    							for(int j=0;j<room.userVc.size();j++)
	    							{
	    								Client client=room.userVc.elementAt(j);
	    								if(client.id.equals(id))
	    								{
	    									client.messageTo(Function.GAMETURN+"|false|"+no+"|"+x+"|"+y);
	    								}
	    								else
	    								{
	    									client.messageTo(Function.GAMETURN+"|true|"+no+"|"+x+"|"+y);
	    								}
	    							}
	    							
	    						}
	    					}
	    				}
    				}
    				
    			}
    		}catch(Exception ex){}
    	}
    	// ������� ���������� ���� 
    	public synchronized void messageTo(String msg)
    	{
    		try
    		{
    			out.write((msg+"\n").getBytes());
    		}catch(Exception ex)
    		{
    			for(int i=0;i<waitVc.size();i++)
    			{
    				Client client=waitVc.elementAt(i);
    				if(id.equals(client.id))
    				{
    					waitVc.removeElementAt(i);
    					break;
    				}
    			}
    		}
    	}
    	// ��ü������ ���� 
    	public synchronized void messageAll(String msg)
    	{
    		for(int i=0;i<waitVc.size();i++)
    		{
    			Client client=waitVc.elementAt(i);
    			try
    			{
    				client.messageTo(msg);
    			}catch(Exception ex)
    			{
    				waitVc.removeElementAt(i);
    			}
    		}
    	}
    }
}
