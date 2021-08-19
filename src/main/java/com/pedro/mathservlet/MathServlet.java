package com.pedro.mathservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MathServlet", value = "/math-servlet")
public class MathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Double n1 = Double.parseDouble(request.getParameter("n1"));
        Double n2 = Double.parseDouble(request.getParameter("n2"));

        Double sum = n1 + n2;
        Double mult = n1 * n2;
        Double sub = n1 - n2;
        Double div = n1 / n2;

        out.println("<html><body>");
        out.println("<h1>" + "CALCULADORA" + "</h1>");
        out.println("<h2>" + "SOMA: " + sum + "</h2>");
        out.println("<h2>" + "MULTIPLICAÇÃO: " + mult + "</h2>");
        out.println("<h2>" + "SUBTRAÇÃO: " + sub + "</h2>");
        out.println("<h2>" + "DIVISÃO: " + div + "</h2>");
        out.println("</body></html>");

    }
}
