package test.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Oracle DB 접속해서 Connection 객체를 리턴해주는 메소드를 제공하는
 * 클래스 정의하기
 */
public class DBConnect {
	//멤버필드
	private Connection conn=null;
	//생성자에서 Connection 객체를 얻어와서 멤버필드에 저장되도록 한다.
	public DBConnect(){	
		//오라클 드라이버 로딩하기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속 할 DB url 정보
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//Connection 객체 얻어오기
			conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//멤버필드에 있는 Connection 객체의 id를 리턴해주는 메소드
	public Connection getConn() {
		return conn;
	}
}
