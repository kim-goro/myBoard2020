package kr.koreait.myboard.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.koreait.myboard.vo.UserVO;

public class UserDAO {
	
	//return 0:에러 발생, 1:등록이 잘 됐음
	public static int joinUser(UserVO param) {
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " insert into t_user "
				+ " (u_id, u_pw, u_nickname, email, ph, addr, sex, birth) "
				+ " values "
				+ " (?, ?, ?, ?, ?, ?, ?, ?) ";
		
		try {
			con = DbBridge.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getU_id());
			ps.setString(2, param.getU_pw());
			ps.setString(3, param.getU_nickname());
			ps.setString(4, param.getEmail());
			ps.setString(5, param.getPh());
			ps.setString(6, param.getAddr());
			ps.setInt(7, param.getSex());
			ps.setString(8, param.getBirth());
			
			result = ps.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbBridge.close(con,  ps);			
		}
		
		return result;
	}
}
