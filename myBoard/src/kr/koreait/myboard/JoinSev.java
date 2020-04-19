package kr.koreait.myboard;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinSev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/join.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u_id = request.getParameter("u_id");
		String u_pw = request.getParameter("u_pw");
		String u_nickname = request.getParameter("u_nickname");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String addr = request.getParameter("addr");
		String sex = request.getParameter("sex");
		String birth = request.getParameter("birth");
		
		System.out.println("u_id : " + u_id);
		System.out.println("u_pw : " + u_pw);
		System.out.println("u_nickname : " + u_nickname);
		System.out.println("email : " + email);
		System.out.println("pw : " + pw);
		System.out.println("addr : " + addr);
		System.out.println("sex : " + sex);
		System.out.println("birth : " + birth);
	}
}
