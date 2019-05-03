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
public class CalculatorPhase2 extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        int firstAdd = Integer.parseInt(request.getParameter("firstAdd"));
        int secondAd = Integer.parseInt(request.getParameter("secondAd"));
        
        boolean check = request.getParameter("firstMult").toString().length() > 0 && request.getParameter("secondMult").toString().length() > 0;
        
        out.println("<html><head><title>Calculator</title></head><body>");
        out.println("<form method='get' action='Calculator'>");
        if (check) {
            int first = Integer.parseInt(request.getParameter("firstMult"));
            int second = Integer.parseInt(request.getParameter("secondMult"));
            out.print("<input type='text' name='firstMult'  size='5' value='" + first + "'/>");
            out.print(" * ");
            out.print("<input type='text' name='secondMult'  size='5' value='" + second + "'/>");
            out.print("=");
            out.print("<input type='text' name='resul1'  size='5' value='" + (first * second) + "'/>");
        } else {
            out.print("<input type='text' name='firstMult'  size='5' value=''/>");
            out.print(" * ");
            out.print("<input type='text' name='secondMult'  size='5' value=''/>");
            out.print("=");
            out.print("<input type='text' name='result1'  size='5' value=''/>");
          
        }
        out.println("<br/>");
        out.print("<input type='text' name='firstAdd'  size='5' value='" + firstAdd + "'/>");
        out.print("<input type='text' name='secondAd'  size='5' value='" + secondAd + "'/>");
        out.print("=");
        out.print("<input type='text' name='result2'  size='5' value='" + (firstAdd + secondAd) + "'/>");
        out.print("<br/>");
        out.print("<input type='submit' value='Submit'/>");
        out.print("</form>");
        
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
