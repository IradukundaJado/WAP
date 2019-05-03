/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author iradukundajado
 */
public class Calculator extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        PrintWriter out = response.getWriter();
        int firstAdd = Integer.parseInt(request.getParameter("firstAdd"));
        int secondAd = Integer.parseInt(request.getParameter("secondAd"));

        boolean check = request.getParameter("firstMult").toString().length() > 0 && request.getParameter("secondMult").toString().length() > 0;

        out.println("<html><head><title>Calculator</title></head><body>");
        if (check) {
            int first = Integer.parseInt(request.getParameter("firstMult"));
            int second = Integer.parseInt(request.getParameter("secondMult"));
            out.print("<p>" + first + " * " + second + " = " + (first * second) + "</p>");
            out.println();
        }
        out.println("<p>" + firstAdd + " + " + secondAd + " = " + (firstAdd + secondAd) + "</p>");

        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
