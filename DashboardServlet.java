package com.rapidresolve;
import jakarta.servlet.*; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*; import java.io.*;
@WebServlet("/dashboard") public class DashboardServlet extends HttpServlet { protected void doGet(HttpServletRequest r,HttpServletResponse s)throws IOException{if(r.getSession(false)==null||r.getSession(false).getAttribute("userId")==null){s.sendRedirect("login.html");return;}s.sendRedirect("dashboard.jsp");}}
