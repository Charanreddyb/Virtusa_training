package com.aug_24;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestCookies
 */
@WebServlet("/TestCookies")
public class TestCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
        String username = null;
        Cookie ck[] = request.getCookies();
        //out.println("Cookies" + ck);
        if (ck != null) {
            out.println("cookie found");
            for (int i = 0; i < ck.length; i++) {
                if (ck[i].getName().equals("user")) {
                    username = ck[i].getValue();
                    out.println("Hello ! &nbsp;&nbsp;" + ck[i].getName() + "\t"
                            + username);
                }
                //out.println("Hello ! &nbsp;&nbsp;" + ck[i]);

 

            }
        } else {
            out.println("No cookies found");
        }
        Enumeration<?> hnames = request.getHeaderNames();
        out.println("<h3>The request headers are:</h3>");
        while (hnames.hasMoreElements()) {
            String hname = (String) hnames.nextElement();
            Enumeration<?> hvalues = request.getHeaders(hname);
            out.println("<br>");
            if (hvalues != null) {
                while (hvalues.hasMoreElements()) {
                    String hvalue = (String) hvalues.nextElement();
                    out.println(hname + ":" + hvalue);
                }
            }
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
