package com.aug_24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DivisionServlet
 */
@WebServlet("/DivisionServlet")
public class DivisionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DivisionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String str1 =request.getParameter("num1");
		String str2 =request.getParameter("num2");
		double a,b;
		double result=0;
		try {
			a=Double.parseDouble(str1);
			b=Double.parseDouble(str2);
			if(b==0) {
				throw new ArithmeticException("Division by zero is not possible");
			}
			else {
			result=a/b;
			response.getWriter().println(result);	
			}
		}
		catch(NumberFormatException | ArithmeticException e)
		{
			e.printStackTrace();
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
