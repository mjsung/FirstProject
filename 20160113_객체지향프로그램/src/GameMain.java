import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameMain extends JFrame implements KeyListener
{
	int type=0;
	GameView gv=new GameView();
	GameMain()
	{
		add("Center", gv);
		setSize(800,600);
		setVisible(true);
		addKeyListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub 키를 눌렀을때 
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_LEFT:
			type=1;
			gv.setImage(1);
			gv.x-=5;
			if(gv.x<0)
				gv.x=800;
			break;
		case KeyEvent.VK_RIGHT:
			type=0;
			gv.setImage(0);
			gv.x+=5;
			if(gv.x>800)
				gv.x=0;
			break;
		case KeyEvent.VK_UP:
			gv.y-=5;
			if(gv.y<0)
				gv.y=600;
			break;
		case KeyEvent.VK_DOWN:
			gv.y-=-5;
			if(gv.y>600)
				gv.y=0;
			break;
		case KeyEvent.VK_ENTER:
			if(type==0)
				gv.setImage(3);
			else if(type==1)
				gv.setImage(2);
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub 키를 놨을 때
		
	}

}
