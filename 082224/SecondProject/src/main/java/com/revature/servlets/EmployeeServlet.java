package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.revature.model.Employee;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "EmployeeServlet", urlPatterns = "/employeeServlet")
public class EmployeeServlet extends HttpServlet {

    private Gson gson = new Gson();

    @Override
    protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response) throws IOException {
        
        Employee employee1 = new Employee(1, "Karan", "IT", 5000);
        Employee employee2 = new Employee(11, "Kiran", "IT Manager", 7000);
        //String employeeJsonString = this.gson.toJson(employee);
        List<Employee> employeeJsonList=new ArrayList<>();
        employeeJsonList.add(employee1);
        employeeJsonList.add(employee2);
        String  employeeJsonString=this.gson.toJson(employeeJsonList);
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(employeeJsonString);
        out.flush();   
    }
}