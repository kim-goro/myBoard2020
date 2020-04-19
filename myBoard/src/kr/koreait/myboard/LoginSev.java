package kr.koreait.myboard;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import kr.koreait.myboard.db.UserDAO;
import kr.koreait.myboard.vo.UserVO;


@WebServlet("/login")
public class LoginSev extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u_id = request.getParameter("u_id");
		String u_pw = request.getParameter("u_pw");
		
		System.out.println("u_id : " + u_id);
		System.out.println("u_pw : " + u_pw);
		
		UserVO param = new UserVO();
		param.setU_id(u_id);
		param.setU_pw(u_pw);
		
		int result = UserDAO.doLogin(param);
		
		System.out.println("result : " + result);
	}

}
