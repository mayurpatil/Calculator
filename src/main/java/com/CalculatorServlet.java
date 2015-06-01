package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        int n1 = Integer.parseInt(req.getParameter("num1"));
        int n2 = Integer.parseInt(req.getParameter("num2"));
        String btn = req.getParameter("btn");
        int res = 0;

        if (btn.equals("Add"))
            res = n1 + n2;

        else if (btn.equals("Sub"))
            res = n1 - n2;

        else if (btn.equals("Mul"))
            res = n1 * n2;

        else if (btn.equals("Div"))
            if (n2 != 0)
                res = n1 / n2;

        resp.setContentType("text/html");

        resp.getWriter().print("<html>");

        resp.getWriter().print("<title>SDMCET-Calculator</title><body>");

        resp.getWriter().print("<form action=\"/calculate\" method=\"post\">");

        resp.getWriter().print("Enter Number 1:");
        resp.getWriter().print("<input type=\"text\" name=\"num1\">");

        resp.getWriter().print("Enter Number 2:");
        resp.getWriter().print("<input type=\"text\" name=\"num2\">");

        resp.getWriter().print(
                "<input name =\"btn\" type=\"submit\" Value=\"Add\">");
        resp.getWriter().print(
                "<input name =\"btn\" type=\"submit\" Value=\"Sub\">");
        resp.getWriter().print(
                "<input name =\"btn\" type=\"submit\" Value=\"Mul\">");
        resp.getWriter().print(
                "<input name =\"btn\" type=\"submit\" Value=\"Div\">");
        resp.getWriter().print("</form>");
        resp.getWriter().print("The result is " + res);

        resp.getWriter().print("</html>");
    }
}