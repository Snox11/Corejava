package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.UserServiceImpl;
import com.service.UserService;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("SignupForm.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String un=request.getParameter("username");
String pass=request.getParameter("password");
String conpass=request.getParameter("conpass");
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
if(pass.equals(conpass)) {
	request.setAttribute("uname", un);
	request.setAttribute("signup", "You are succesfully signed up");
	User u=new User();
	u.setFname(fname);
	u.setLname(lname);
	u.setPassword(pass);
	u.setUsername(un);
	UserService service=new UserServiceImpl();
	service.adduser(u);
	request.getRequestDispatcher("Home.jsp").forward(request, response);
}else {
	request.setAttribute("message","The passwords dont match");
	request.getRequestDispatcher("SignupForm.jsp").forward(request, response);
}

}
	}
