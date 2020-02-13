package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getCelsServlet
 */
@WebServlet("/getCelsServlet")
public class getCelsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userTemp = request.getParameter("userTemp");
		TempConverter userConvert = new TempConverter(Double.parseDouble(userTemp));
		
		userConvert.getResult("Celsius");
		
		request.setAttribute("userTempOut", userConvert);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
