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

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Calculator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
