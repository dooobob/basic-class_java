package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

/*
 * Oracle DB에 member테이블의 특정회원의 정보를 수정하는 작업하기
 */
public class MainClass04 {
	public static void main(String[] args) {
		//수정할 회원의 번호
		int num=1;
		//수정할 회원의 주소
		String addr="캐나다";
		
		//필요한 객체를 담을 변수 선언하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=new DBConnect().getConn();
			//실행할 SQL문 준비하기
			String sql="UPDATE member SET addr=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);
			//sql문을 실제로 수행한다.
			int flag=pstmt.executeUpdate();
			if(flag>0){
				System.out.println("회원정보 수정 성공!");				
			}else{
				System.out.println("회원정보 수정 실패!");
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
