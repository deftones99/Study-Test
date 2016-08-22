package com.ray.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletDemo
 */
// @WebServlet(description = "一个servletDemo", urlPatterns = { "/servletDemo" })
public class servletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public servletDemo() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String action = request.getParameter("action");
		if (action.equals("login_input")) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else if (action.equals("login")) {
			String name = request.getParameter("name");
			String password = request.getParameter("password");

			System.out.println("name->" + name + ",password->" + password);
		}

	}

}
