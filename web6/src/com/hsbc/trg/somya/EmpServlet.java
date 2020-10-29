package com.hsbc.trg.somya;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet {

	HashMap<Integer, Employee> data = new HashMap<>();

	public void init(ServletConfig config) throws ServletException {
		data.put(100, new Employee(100, "somya"));
		data.put(200, new Employee(200, "aman"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String s = request.getParameter("empId");
		int empId = Integer.parseInt(s);

		Employee x = data.get(empId);

		PrintWriter pw = response.getWriter();
		pw.println("<HTML>");
		pw.println("<HEAD>");
		pw.println("<TITLE>Welcome page</TITLE>");
		pw.println("</HEAD>");
		pw.println("<BODY>");

		if (x == null) {
			pw.println("Employee not found");
		} else {
			pw.println("Employee Id: " + x.getEmpId() + "<br>");
			pw.println("Name: " + x.getName() + "<br>");
		}
		pw.println("<a href='emp.html'> Back </a>");
		pw.println("</BODY>");
		pw.println("</HTML>");
		
		pw.close();
	}

}
