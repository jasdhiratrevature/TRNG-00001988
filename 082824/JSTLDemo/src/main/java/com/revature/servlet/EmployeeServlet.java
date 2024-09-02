package com.revature.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1); emp1.setName("Pankaj");emp1.setRole("Developer");
		Employee emp2 = new Employee();
		emp2.setId(2); emp2.setName("Meghna");emp2.setRole("Manager");
		empList.add(emp1);empList.add(emp2);
		request.setAttribute("empList", empList);
		
		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "https://www.revature.com");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/coretags.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
