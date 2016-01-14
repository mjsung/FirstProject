import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
	Image back;
	Image move;
	int x=15;
	int y=470;
	String[] img={"right.gif", "left.gif", "enter.gif","enter2.gif"};
	GameView() //생성자
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\back.jpg");
		move=Toolkit.getDefaultToolkit().getImage("c:\\image\\right.gif");
	}
	void setImage(int no)
	{
		move=Toolkit.getDefaultToolkit().getImage("c:\\image\\"+img[no]);
	}
	@Override //오른쪽버튼 source에서 override~~ paint -그림그리기
	public void paint(Graphics g) {
		g.drawImage(back, 0,0, getWidth(), getHeight(), this);
		g.drawImage(move, x, y, this);
	}
	
}
