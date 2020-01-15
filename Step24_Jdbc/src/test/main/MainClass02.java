package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass02 {
	public static void main(String[] args) {
		int num=12;
		String name="용xx";
		String addr="인천";		
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
		try{
			conn.setAutoCommit(false);//자동 commit 되지 않도록
			//실행할 SQL문 준비하기
			String sql="INSERT INTO member (num,name,addr) VALUES(?,?,?)";			
			//PreparedStatement객체의 id를 얻어와서 변수에 대입
			pstmt=conn.prepareStatement(sql);
			//?에 필요한 값을 순서대로 바인딩 한다.(?표순서,대입값)
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			//SQL문 수행하고 결과값은 int type으로 리턴된다.
			int flag=pstmt.executeUpdate();//성공적으로 수행됬다면 0보다 큰 정수가 리턴
			if(flag>0){
				System.out.println("회원정보 입력 성공!");
				throw new SQLException();//강제로 예외 발생시키기
			}else{
				System.out.println("회원정보 입력 실패!");
			}
			conn.commit();//예외가 발생하지 않았다면 DB에 반영하고
		}catch(Exception e){			
			e.printStackTrace();
			try{
				conn.rollback();//예외가 발생했으면 DB에 반영하지 않는다
			}catch(Exception e2){}
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
	}
}
