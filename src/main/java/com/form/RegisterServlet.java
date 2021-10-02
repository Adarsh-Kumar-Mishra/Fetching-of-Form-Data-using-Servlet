package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	      resp.setContentType("text/html");
    	      PrintWriter out = resp.getWriter();
    	      out.println("<h2>Welcomr to Register servlet</h2>");
    	      String name = req.getParameter("user_name");
    	      String password = req.getParameter("user_password");
    	      if(name.length()!=0) {
    	    	  
    	    	  ///jdbc
    	    	  RequestDispatcher rd = req.getRequestDispatcher("success");
    	    	  rd.include(req, resp);
    	    	  out.println("<h2> Name :"+name+"<h2>");
    	    	  out.println("<h2> Password :"+password+"<h2>");
    	      }else {
    	    	  out.print("You have not filled the form yet");
    	    	  RequestDispatcher rd = req.getRequestDispatcher("index.html");
    	    	  rd.include(req, resp);
    	      }
     }
}
