package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Oracle DB에 연결해서 member테이블의 정보 읽어와서 콘솔에 출력해보기
 * 
 * 1. Oracle Driver를 로딩한다.
 * 2. 접속 할 oracle db의 ip주소와 port번호, db이름을 구성한다.
 * 3. 접속 할 계정과 비밀번호를 확인한다.
 * 4. Connection 객체의 참조값을 얻어와서 작업한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		Connection conn=null;		
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
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement("SELECT num,name,addr FROM member");
			rs=pstmt.executeQuery();
			while(rs.next()){
				//현재 커서가 위치한 row의 데이터를 추출한다.
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//콘솔창에 출력해보기
				System.out.println(num+"/"+name+"/"+addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
	}
}
