package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * Dao => Data Access Object의 약자
 * 
 * - member 테이블에 대해서 SELECT, INSERT, UPDATE, DELETE작업을 수행 할 객체를
 *	 생성하기 위한 클래스 설계하기
 *
 *- Application 전역에서 MemberDao 객체는 오직 1개만 생성될 수 있도록 설계한다.
 */
public class MemberDao {
	//자신의 객체의 id를 저장 할 static 멤버필드 정의하기
	private static MemberDao dao;
	//외부에서 객체를 생성할 수 없도록 생성자를 private 접근 지정자로 만든다.
	private MemberDao(){}
	//자신의 참조값을 리턴해주는 static멤버 메소드를 제공한다.
	public static MemberDao getInstance(){
		//최초 호출 된다면 객체를 생성해서 멤버필드에 저장한다.
		if(dao==null){
			dao=new MemberDao();
		}
		return dao;//static 멤버필드에 있는 참조값을 리턴해준다.
	}	
	
	//회원 한명의 정보를 member 테이블에 저장하고 성공 혹은 실패를 boolean Type으로
	//리턴해주는 일반 멤버 메소드 만들기
	public boolean insert(MemberDto dto){
		//필요한 객체의 id를 담을 변수 선언하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isSuccess=false;//작업성공 혹은 실패여부를 담을 변수
		try{
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			//실행할 SQL문 준비하기
			String sql="INSERT INTO member(num,name,addr) VALUES(?,?,?)";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			int flag=pstmt.executeUpdate();
			if(flag>0){
				isSuccess=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		return isSuccess;
	}//insert()
	
	//회원의 정보를 수정하는 메소드
	public boolean update(MemberDto dto,int inum){
		//필요한 객체를 담을 변수 초기화 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isSuccess=false;
		
		try{
			conn=new DBConnect().getConn();
			String sql="UPDATE member SET name=?,addr=?,num=? WHERE num=?";			
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setInt(3, inum);
			pstmt.setInt(4, dto.getNum());
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			int flag=pstmt.executeUpdate();
			if(flag>0){
				isSuccess=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();				
			}catch(Exception e){}
		}
		return isSuccess;
	}//update()
	
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int num){
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isSuccess=false;
		try{
			conn=new DBConnect().getConn();
			String sql="DELETE FROM member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setInt(1, num);
			int flag=pstmt.executeUpdate();
			if(flag>0){
				isSuccess=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		return isSuccess;
	}//delete()
	
	//인자로 전달된 번호에 해당하는 회원정보를 MemberDto 리턴해주는 메소드
	public MemberDto getData(int num){
		Connection conn=null;
		PreparedStatement pstmt=null;
		MemberDto dto=null;//회원정보를 담을 공간
		try{
			conn=new DBConnect().getConn();
			String sql="SELECT * FROM member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setInt(1, num);
			//Query문 수행하고 결과값을 ResultSet Type으로 얻어온다.
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){//select된 data가 있다면 커서를 한칸 내린다.
				//MemberDto객체를 생성해서 id값을 변수에 담는다.
				dto=new MemberDto();
				//dto객체에 Result에 담긴 회원정보를 하나씩 넣어준다.
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		//MemberDto객체의 id를 리턴해준다. 해당 회원이 존재하지 않는 경우 null이다.
		return dto;
	}//getData()
	
	//모든 회원의 정보를 List<MemberDto> Type 으로 리턴해주는 메소드
	public List<MemberDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		//회원정보를 담을 가변 배열 객체 생성하기
		List<MemberDto> list=new ArrayList<MemberDto>();
		try{
			conn=new DBConnect().getConn();
			String sql="SELECT * FROM member ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			//SELECT된 회원정보가 ResultSet Type으로 얻어진다.
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){			
				//MemberDto 객체를 생성해서
				MemberDto dto=new MemberDto();
				//현재 커서가 위치한 곳의 회원정보를 담는다.
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				//배열에 dto의 id를 누적시킨다.
				list.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		//SELECT된 회원정보가 없으면 list의 size가 0이다.
		return list;
	}
}
