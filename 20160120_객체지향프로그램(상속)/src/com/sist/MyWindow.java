package com.sist;
/*
 * 기존의 만들어진 클래스를 사용
 * =================
 * 		  B
 * =================
 * 1. 상속 ==> is-a : 단일상속
 * class A extends B    
 * 2. 포함 ==> has-a
 * class A
 * {
 *     B b;  => 익명의 클래스(재정의)
 * }
 * 
 * ===============================
 * 사용자정의 class
 * 라이브러리 상속   => 윈도우
 * 
 * 윈도우 제작
 * 1) 라이브러리를 읽어온다
 * 	  import javax.swing : 윈도우와 관련된 모든 클래스
 * 	  import java.awt : Layout
 * 	  import java.awt.event : 이벤트 처리
 * 2) 화면 구성 
 * 	  = 필요한 컴포넌트를 선언
 *  	JButton b1, b2;
 *    = 생성자에서 컴포넌트를 메모리 할당
 *    	b1=new JButton();
 *      속성처리
 *      b1.setEnabled(false)
 *      배치
 *      윈도우 크기 setSize(w,h)
 *      윈도우 보여라 setVisiable(true)
 * 3) 호출
 * 	   new 생성자()
 * 4) 이벤트에 대한 처리 ==> interface
 * ===============================
 * 
 * 윈도우 창(Container)
 * 	 = JFrame : 일반 윈도우(타이틀바를 가지고 있음)
 * 	 = JWindow : 타이틀바가 없는 윈도우(게임소개, 로그인)
 * 	 = JDialog : 윈도우 위에 윈도우를 또 띄우는 공지,쪽지 같은 창
 * 				 Modal(위에 뜬 창을 끄기전까지 그 밑의 윈도우창 클릭 및 사용 불가능)
 * 				 Modaless(윈도우 위에 뜬 창과 그 밑에 뜬 윈도우가 다 사용가능)
 * 	 = JPanel : 단독으로 수행이 불가능 (Component 묶어서 사용이 가능)
 * 
 * 기능(Component)
 * 	 = Button (JButton, JRadioButton, JCheckbox, JMenu)
 * 	 = TextField (JTextField, JPasswordField)
 *   = TextArea (JTextArea, JTextPane)
 *   = List (JList, JTabel, JTree)
 *   = etc : JProgressBar, JSilderBar, JScrollPane
 *     => 윈도우 분리 :  JTabbedPane, JSplitPane, JInternalFrame
 * 배치
 *   = BorderLayout (5군데 배치)
 *   = FlowLayout (1자 배열)
 *   = GridLayout 
 *   = CardLayout (감춰뒀다 사용)
 *   
 * 이벤트
 *   = ActionListener : Button, Menu, TextField
 *   = MouseListener : 모든 컴포넌트에 적용
 *   = KeyListener : 키워드와 관련
 *   = ItemListener : 콤보, 목록선택
 */
import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame{
	JButton b1,b2,b3,b4,b5; //포함클래스
	public MyWindow()
	{
		b1=new JButton("North", new ImageIcon("c:\\image\\enter.gif"));
		//생성자 => 오버로딩
		b2=new JButton("East");
		b2.setToolTipText("로그인"); //풍선도움말
		b3=new JButton("West");
		b3.setEnabled(false); //비활성화
		b4=new JButton("Center");
		//b4.setForeground(Color.MAGENTA);
		b4.setForeground(new Color(223,159,220)); //R.G.B 순서 //앞에 set이 붙는건 속성처리
		b5=new JButton("South");
		b1.setRolloverIcon(new ImageIcon("c:\\image\\enter2.gif"));
		//배치 - 설정안한 디폴트값은 BorderLayout
		/*add("North",b1);
		add("East",b2);
		add("West",b3);
		add("Center",b4);
		add("South",b5);*/
		
		//setLayout(new FlowLayout());
		/*JPanel p=new JPanel();
		p.add(b1);
		p.add(b5);
		p.add(b2);
		p.add(b4);
		p.add(b3);
		add("Center",p);*/
		
		setLayout(new GridLayout(5,1,5,30)); //줄, 열, 좌우간격
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);		
		
		
		setSize(640,480);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow m=new MyWindow();
	}

}
