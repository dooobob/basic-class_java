package test.main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameMain extends JFrame{
	
	//생성자
	public FrameMain(){		
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		//패널 객체 생성하기
		JPanel panel=new JPanel();
		
		//버튼 객체 생성하기
		JButton button=new JButton("눌러보셈!");
		
		//버튼을 패널에 추가하기
		panel.add(button);
		
		//패널을 프레임에 추가하기
		add(panel, BorderLayout.CENTER);
		
		//프레임의 위치, 폭과 높이 지정
		setBounds(500, 200, 300, 300);
		//눈에 보일 수 있도록 한다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameMain();
	}
}
