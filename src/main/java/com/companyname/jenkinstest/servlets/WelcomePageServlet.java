package com.companyname.jenkinstest.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * author by davitpetrosyan on 12/21/16.
 */
public class WelcomePageServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.write("Hello world");
		writer.write("\n");
		writer.write("test1");
		writer.write("test2");
		writer.write("test3");
		writer.write("test4");
		writer.write("test5");
		writer.write("test6");
		writer.write("test7");
		writer.write("test8");
		writer.flush();
		writer.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
