package test.main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrameMain4 extends JFrame implements ActionListener{
	//버튼의 참조값을 저장할 멤버필드
	JButton btn1,btn2,btn3;
	//생성자
	public FrameMain4(){		
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		//패널 객체 생성하기
		JPanel panel=new JPanel();
		
		//버튼 객체 생성하기
		btn1=new JButton("버튼1");
		btn2=new JButton("버튼2");
		btn3=new JButton("버튼3");
		//버튼에 리스너 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		//패널을 프레임에 추가하기
		add(panel, BorderLayout.CENTER);
		
		//프레임의 위치, 폭과 높이 지정
		setBounds(500, 200, 500, 300);
		//눈에 보일 수 있도록 한다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Component a=new FrameMain4();
	}
	//implements ActionListener 했기 때문에 강제 구현된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값을 얻어온다.
		Object which=e.getSource();
		//어떤 버튼이 눌러졌는지 참조값을 달리해서 다른 동작을 할 수 있다.
		if(which==btn1){
			JOptionPane.showMessageDialog(this, "1버튼을 눌렀네?");
		}else if(which==btn2){
			JOptionPane.showMessageDialog(this, "2버튼을 눌렀네?");
		}else if(which==btn3){
			JOptionPane.showMessageDialog(this, "3버튼을 눌렀네?");
		}
	}
}
