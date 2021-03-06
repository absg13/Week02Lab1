/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 738377
 */
public class AgeCalculatorServlet extends HttpServlet {
    
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
        
        String age = request.getParameter("age");
        
        if (age == null) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                    forward(request, response);
            
            return;
        } 
        
        else if (age.isEmpty()) {
            request.setAttribute("errorMessage", "You must give your current age.");
           
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                    forward(request, response);
            
            return;
        } 
       
        int ageNextYear = 0;
        
        //https://stackoverflow.com/questions/21803908/how-to-check-if-a-string-is-a-valid-integer
        try {
            
            ageNextYear = Integer.parseInt(age) + 1;
            request.setAttribute("success", "Your age next will be " + ageNextYear);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                forward(request, response);
            
        } catch (NumberFormatException e) {
            
            request.setAttribute("errorMessage", "You must enter a number.");
            request.setAttribute("age", age);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                forward(request, response);
        
        }
        
        
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
        
    }// </editor-fold>

}
