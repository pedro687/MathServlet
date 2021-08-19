package com.pedro.mathservlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "pedroServlet", value = "/pedro-servlet")
public class PedroServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "RA: 1290482012028" + "</h1>");
        out.println("<h1>" + "NOME: Pedro Emanoel do Nascimento Silva" + "</h1>");
        out.println("<h1>" + "Link do github:" +  "<a href='https://github.com/PedroSpiet'>Github </a>" +"</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}