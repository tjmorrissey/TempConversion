package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GenerateUser;
import model.TempConverter;

/**
 * Servlet implementation class getUsernameServlet
 */
@WebServlet("/getUsernameServlet")
public class getUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getUsernameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userFName = request.getParameter("userFName");
		String userLName = request.getParameter("userLName");
		GenerateUser userName = new GenerateUser(userFName, userLName);
		
		request.setAttribute("userNameOut", userName);
		
		getServletContext().getRequestDispatcher("/newuser.jsp").forward(request, response);
	}

}
