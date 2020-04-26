package kr.koreait.myboard;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.koreait.myboard.db.BoardDAO;
import kr.koreait.myboard.vo.BoardVO;

@WebServlet("/boardDetail")
public class BoardDetailSev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i_board = request.getParameter("i_board");
		String hits = request.getParameter("hits");
		int intI_board = Integer.parseInt(i_board);
		int intHits = Integer.parseInt(hits);
		
		System.out.println("i_board: " + intI_board);
		System.out.println("intHits: " + intHits);
		
		BoardVO param = new BoardVO();
		param.setI_board(intI_board);
		param.setHits(intHits + 1);
		
		BoardDAO.updateBoard(param);
			
		request.setAttribute("detail", BoardDAO.getBoard(intI_board));
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/boardDetail.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
