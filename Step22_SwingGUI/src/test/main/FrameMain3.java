package test.main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrameMain3 extends JFrame implements ActionListener{
	
	//생성자
	public FrameMain3(){		
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		//패널 객체 생성하기
		JPanel panel=new JPanel();
		
		//버튼 객체 생성하기
		JButton button=new JButton("눌러보셈!");
		button.addActionListener(this);
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
		Component a=new FrameMain3();
	}
	//implements ActionListener 했기 때문에 강제 구현된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "버튼을 눌렀네?");
	}
}
