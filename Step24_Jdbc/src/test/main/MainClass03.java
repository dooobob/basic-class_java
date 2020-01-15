package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

/*
 * Oracle DB의 member테이블에서 특정 회원정보 삭제
 */
public class MainClass03 {
	public static void main(String[] args) {
		//삭제할 회원의 번호
		int num=10;
		
		//필요한 객체의 id를 담을 변수 선언하기
		PreparedStatement pstmt=null;
		Connection conn=null;
		try{
			//유틸 클래스를 이용해서 객체를 생성 후 Connection 객체의 id를 얻어온다.
			conn=new DBConnect().getConn();
			//실행할 SQL문을 준비한다.
			String sql="DELETE FROM member WHERE num=?";
			//Connection 객체를 이용해서 PreparedStatement 객체의 id를 얻어온다.
			pstmt=conn.prepareStatement(sql);
			//?값 바인딩하기
			pstmt.setInt(1, num);
			//sql문 수행하기
			int flag=pstmt.executeUpdate();
			if(flag>0){
				System.out.println("회원정보를 삭제 했습니다.");				
			}else{
				System.out.println("회원정보 삭제 실패!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
	}
}
