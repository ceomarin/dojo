package com.ceomarin.informacionusuario.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("name")== null?"Unknow":request.getParameter("name");
		String lastname = request.getParameter("lastname")== null?"Unknow":request.getParameter("lastname");
		String language = request.getParameter("language")== null?"Unknow":request.getParameter("language");
		String hometown = request.getParameter("hometown")== null?"Unknow":request.getParameter("hometown");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome "+userName+" "+lastname+"</h1>");
		out.write("<p>Your favorite language is: "+language+"</p>");
		out.write("<p>Your hometown is: "+hometown+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
