package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{
  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  resp.setContentType("text/html");
	  PrintWriter out = resp.getWriter();
	  out.println("This is success servlet");
	  out.print("<h2>You have successfully filled the form</h2>");
	  String name = req.getParameter("user_name");
      String password = req.getParameter("user_password");
      out.print("<h2>Now check your data </h2>");
      out.print("<h2>name : "+name+ "</h2>");
      out.print("<h2>password : "+password+"</h2>");
	  
  }
}
